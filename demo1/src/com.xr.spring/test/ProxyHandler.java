package com.xr.spring.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {
    Object p;
    public  void setP(Object p){
        this.p = p;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Exception{
        System.out.println("开始代理");
        Object invoke = method.invoke(p, args);
        System.out.println("结束代理");
        return invoke;
    }
}
