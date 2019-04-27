package com.base.proxy.StaticProxy;

/**
 *  目标对象 -- [静态代理]
 */
public class IUserImpl implements IUser{
    @Override
    public String saveUserInfo() {
        return "我是目标对象的saveUserInfo 方法";
    }
}
