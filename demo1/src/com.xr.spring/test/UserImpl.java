package com.xr.spring.test;

import sun.security.action.GetBooleanAction;

import java.lang.reflect.Proxy;
import java.security.AccessController;

public class UserImpl implements User {
    @Override
    public void hello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        AccessController.doPrivileged(new GetBooleanAction("sun.misc.ProxyGenerator.saveGeneratedFiles"));
        UserImpl user = new UserImpl();
        ProxyHandler proxyHandler = new ProxyHandler();
        proxyHandler.setP(user);
        User o = (User)Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{User.class}, proxyHandler);
        o.hello();

    }
}
