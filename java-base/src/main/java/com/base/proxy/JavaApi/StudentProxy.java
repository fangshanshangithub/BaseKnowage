package com.base.proxy.JavaApi;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理对象 -- jdk 自带的Proxy类 -- 动态代理1
 */
public class StudentProxy {

    // 动态代理  目标对象使用object 传递
    private Object target;

    public StudentProxy(Object object) {
        this.target = object;
    }

    public Object getStudentPorxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),//
                target.getClass().getInterfaces(), //
                new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                return method.invoke(target, args);
            }
        });
    }


    public static void main(String[] args) {
        IStudent student = new StudentTarget();

        IStudent sProxy = (IStudent) new StudentProxy(student).getStudentPorxy();

        System.out.println(sProxy.getStudentName());

    }

}
