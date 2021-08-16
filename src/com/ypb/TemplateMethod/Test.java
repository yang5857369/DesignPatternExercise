package com.ypb.TemplateMethod;

/**
 * 模板方法
 * 案例：抄试卷
 * 将不同实现交给子类去实现，以达到“答案不同”的效果
 */
public class Test{

    public static void main(String[] args) {
        AbstractClass abstractClassA = new concreteClassA();
        AbstractClass abstractClassB = new concreteClassB();
        abstractClassA.primitiveOperation1();
        abstractClassA.primitiveOperation2();
        abstractClassB.primitiveOperation1();
        abstractClassB.primitiveOperation2();
    }

}
