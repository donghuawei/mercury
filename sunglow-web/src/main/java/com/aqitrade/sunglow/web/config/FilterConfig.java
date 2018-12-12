package com.aqitrade.sunglow.web.config;

import com.aqitrade.sunglow.core.utils.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean <LogFilter> filterRegistrationBean() {
        FilterRegistrationBean <LogFilter> registrationBean = new FilterRegistrationBean();
        LogFilter logFilter = new LogFilter();

        registrationBean.setFilter(logFilter);
        registrationBean.addUrlPatterns("/*");
        registrationBean.setOrder(2); //set precedence
        return registrationBean;
    }
}
