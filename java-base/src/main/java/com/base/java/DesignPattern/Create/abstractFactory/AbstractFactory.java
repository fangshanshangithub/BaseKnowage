package com.base.java.DesignPattern.Create.abstractFactory;


/**
 * 抽象工厂类
 *
 * 工厂 有工厂接口
 * 常品 有产品接口
 *
 * 产品 - 工厂 1 ：1 一一对应
 *
 *
 */
public class AbstractFactory {

    public static void main(String[] args) {

        Product product = new FactoryA().getProduct();
    }

}

// 工厂类公用接口
interface  FactoryInterface {
    Product getProduct();
}

class FactoryA implements FactoryInterface {

    @Override
    public Product getProduct() {
        return new ProductA();
    }
}

class FactoryB implements FactoryInterface {

    @Override
    public Product getProduct() {
        return new ProductB();
    }
}

class FactoryC implements FactoryInterface {

    @Override
    public Product getProduct() {
        return new ProudctC();
    }
}



// 公用 产品接口
interface  Product{
    void init();
}

// 三个产品 相同方法名 方便调用
class ProductA implements Product {
    public void init() {
        System.out.println("ProductA.initA: 产品 --- A" );
    }
}

class ProductB implements Product {
    public void init() {
        System.out.println("ProductB.initB: 产品 --- B");
    }
}


class ProudctC implements Product {

    public void init() {
        System.out.println("ProudctC.initC: 产品 --- C");
    }

}