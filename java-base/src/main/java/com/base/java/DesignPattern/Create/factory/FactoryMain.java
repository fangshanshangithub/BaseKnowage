package com.base.java.DesignPattern.Create.factory;

/**
 * 工厂模式
 * 产品类 实现公用的接口
 * 工厂类 获取产品
 * 产品 - 工厂 n ：1
 */
public class FactoryMain {

    public static void main(String[] args) {
        Product product = new Factory().getProduct("A");

        product.init();
    }
}



class Factory{
    ProductA productA = new ProductA();
    ProductB productB = new ProductB();
    ProudctC proudctC = new ProudctC();

    public Product getProduct(String name) {
        if("A".equals(name)) {
            return productA;
        }
        else if("B".equals(name)) {
            return productB;
        }
        else if("C".equals(name)) {
            return proudctC;
        }
        return null;
    }

}


// 公用 产品接口
interface  Product{
    void init();
}

// 三个产品 相同方法名 方便调用
class ProductA implements Product{
    public void init() {
        System.out.println("ProductA.initA: 产品 --- A" );
    }
}

class ProductB implements Product{
    public void init() {
        System.out.println("ProductB.initB: 产品 --- B");
    }
}


class ProudctC implements Product{

    public void init() {
        System.out.println("ProudctC.initC: 产品 --- C");
    }

}

