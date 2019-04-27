package com.base.proxy.StaticProxy;

/**
 *  代理对象 -- [静态代理]
 *
 *  实现和目标对象一样的接口,并且可以自己扩展【代理的目的是保证目标对象不改变的前提下可以扩展更多的功能】
 *
 */
public class PUserImpl  implements IUser{

    // 声明目标对象
    private IUser target;

    // 构造函数接受目标对象
    public PUserImpl(IUser iuser) {
        target = iuser;
    }


    @Override
    public String saveUserInfo() {
        return target.saveUserInfo();
    }


    /*
     * 代理方法调用
     * 静态代理原则：
     * 1.目标对象和代理对象要实现同一个接口
     * 2.代理对象中要调用目标对象的具体方法，并且可以扩展其它的方法
     * 3.调用时想声明目标对象，并且传入代理对象中，调用代理对象的方法来调用目标对象的方法
     */
    public static void main(String[] args) {
        // 目标对象
        IUserImpl iuser = new IUserImpl();

        // 代理对象 -- 传入目标对象
        PUserImpl pUser = new PUserImpl(iuser);

        // 调用代理对象的方法，在这个方法里调用目标对象的指定方法
        System.out.println(pUser.saveUserInfo());





    }
}
