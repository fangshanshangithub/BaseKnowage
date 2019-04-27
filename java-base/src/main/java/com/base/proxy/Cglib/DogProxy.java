package com.base.proxy.Cglib;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DogProxy implements MethodInterceptor {

    private Object target;

    public DogProxy(Object object) {
        this.target = object;
    }


    public Object getTargetObject() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();

    }


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return method.invoke(target, objects);
    }


    public static void main(String[] args) {
        Dog dog = (Dog) new DogProxy(new Dog()).getTargetObject();

        dog.run();
    }

}
