package com.jd.mybatis.support.plugin;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;

import java.sql.Connection;
import java.util.Properties;

/**
 * user:hudawei1
 * date:2018/1/24
 * time:18:21
 */
@Intercepts({ @Signature(type = StatementHandler.class, method = "prepare", args = { Connection.class }) })
public class ExamplePlugin implements Interceptor {

    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("=========进入ExamplePlugin intercept方法==========="+invocation.getTarget().getClass());
        StatementHandler statementHandler = (StatementHandler) invocation.getTarget();
        BoundSql boundSql = statementHandler.getBoundSql();
        String sql = boundSql.getSql();
        System.out.println("mybatis intercept sql:"+sql);
        return invocation.proceed();
    }

    public Object plugin(Object target) {
        System.out.println("=========进入ExamplePlugin plugin方法==========="+target.getClass());
        return Plugin.wrap(target, this);
    }

    public void setProperties(Properties properties) {
//        String dialect = properties.getProperty("dialect");
//        System.out.println("mybatis intercept dialect:"+dialect);
    }

}
