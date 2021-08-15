package com.ypb.Decorator;

/**
 * @author ypb
 * @date 2021/8/13 20:59
 */
public class Test {

    public static void main(String[] args) {
        BaseComponent base = new BaseComponent();

        ComponentDecoratorA a = new ComponentDecoratorA();
        a.setComponent(base);

        ComponentDecoratorB b = new ComponentDecoratorB();
        b.setComponent(a);

        // base -> a -> b.operate() = super.operate() -> previous component
        b.Operation();

    }
}
