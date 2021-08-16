package com.ypb.Facade;

/**
 * 外观模式
 * 为子系统中的一组接口定义一个一致的界面
 */
public class Test {

    public static void main(String[] args) {

        Facade facade = new Facade();

        facade.MethodA();
        facade.MethodB();
    }
}
