package com.ypb.Decorator;

/**
 * @author ypb
 * @date 2021/8/13 20:59
 */
public class ComponentDecoratorB extends Decorator{

    @Override
    public void Operation() {
        super.Operation();
        System.out.println("这里是ConcreteDecoratorB的Operation方法，具有特有的操作");
    }
}
