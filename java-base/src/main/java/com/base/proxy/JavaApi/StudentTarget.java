package com.base.proxy.JavaApi;

/**
 * 目标对象 -- jdk 自带的Proxy类 -- 动态代理1
 */
public class StudentTarget implements IStudent{
    @Override
    public String getStudentName() {
        return "我是StudentTarget的getStudentName方法";
    }
}
