package com.ypb.Decorator;

/**
 * @author ypb
 * @date 2021/8/13 20:56
 */
public class ComponentDecoratorA extends Decorator{

    @Override
    public void Operation() {
        super.Operation();
        System.out.println("这里是ConcreteDecoratorA的Operation方法，具有特有的操作");
    }
}
