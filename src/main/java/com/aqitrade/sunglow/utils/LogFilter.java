package com.aqitrade.sunglow.utils;


import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.filter.OncePerRequestFilter;
import org.springframework.web.util.ContentCachingRequestWrapper;
import org.springframework.web.util.WebUtils;

/**
 * A filter which logs web requests that lead to an error in the system.
 */
@Component
public class LogFilter extends OncePerRequestFilter implements Ordered {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    // put filter at the end of all other filters to make sure we are processing after all others
    private int order = Ordered.LOWEST_PRECEDENCE - 8;

    @Override
    public int getOrder() {
        return order;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {
        ContentCachingRequestWrapper wrappedRequest = new ContentCachingRequestWrapper(request);

        int status = HttpStatus.INTERNAL_SERVER_ERROR.value();

        // pass through filter chain to do the actual request handling
        filterChain.doFilter(wrappedRequest, response);
        status = response.getStatus();

        // only log request if there was an error
//        if (status == HttpStatus.INTERNAL_SERVER_ERROR.value()) {
            Map<String, Object> trace = getTrace(wrappedRequest, status);

            // body can only be read after the actual request handling was done!
            getBody(wrappedRequest, trace);
            logTrace(wrappedRequest, trace);
//        }

    }

    private void getBody(ContentCachingRequestWrapper request, Map<String, Object> trace) {
        // wrap request to make sure we can read the body of the request (otherwise it will be consumed by the actual
        // request handler)
        ContentCachingRequestWrapper wrapper = WebUtils.getNativeRequest(request, ContentCachingRequestWrapper.class);
        if (wrapper != null) {
            byte[] buf = wrapper.getContentAsByteArray();
            if (buf.length > 0) {
                String payload;
                try {
                    payload = new String(buf, 0, buf.length, wrapper.getCharacterEncoding());
                }
                catch (UnsupportedEncodingException ex) {
                    payload = "[unknown]";
                }

                trace.put("body", payload);
            }
        }
    }

    private void logTrace(HttpServletRequest request, Map<String, Object> trace) {
        Object method = trace.get("method");
        Object path = trace.get("path");
        Object statusCode = trace.get("statusCode");

        logger.debug(String.format("%s %s produced status code '%s'. Trace: '%s'", method, path, statusCode,
                trace));
    }

    protected Map<String, Object> getTrace(HttpServletRequest request, int status) {
        Throwable exception = (Throwable) request.getAttribute("javax.servlet.error.exception");

        Principal principal = request.getUserPrincipal();

        Map<String, Object> trace = new LinkedHashMap<String, Object>();
        trace.put("method", request.getMethod());
        trace.put("path", request.getRequestURI());
        trace.put("query", request.getQueryString());
        trace.put("statusCode", status);

        return trace;
    }

}

