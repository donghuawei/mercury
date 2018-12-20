package com.aqitrade.mercury.core.mapper.common;


import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BaseSqlProvider {

    private Map<Class, String> class2tableName = new ConcurrentHashMap<>();

    public String list(Class clazz){
        StringBuilder sql = new StringBuilder("select ");

        //append columns
        Arrays.stream(clazz.getDeclaredFields()).forEach(field -> {
            sql.append(camelCase2underscore(field.getName()) + ",");
        });
        //remote the last extra ","
        sql.deleteCharAt(sql.length() - 1);

        //append from
        sql.append(" from ");

        //append table name
        String className = clazz.getSimpleName();
        sql.append(camelCase2underscore(className));

        //TODO store the sql to map cache

        return sql.toString();
    }

    public String get(Class klass, Serializable id){
        StringBuilder sql = new StringBuilder();
        //TODO
        return sql.toString();
    }

    public String camelCase2underscore(String camelCaseName){
        if(camelCaseName == null)
            return null;
        StringBuilder underscoreName = new StringBuilder();

        //handle the first character,  eg.  User -- table,  userId -- user_id
        underscoreName.append(Character.toLowerCase(camelCaseName.charAt(0)));
        //handle the remaining characters
        camelCaseName.chars().skip(1).forEach(c -> {
            if(Character.isLowerCase(c)){
                underscoreName.append((char)c);
            } else {
                underscoreName.append("_" + Character.toLowerCase((char)c));
            }
        });
        return underscoreName.toString();
    }

}
