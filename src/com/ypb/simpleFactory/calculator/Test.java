package com.ypb.simpleFactory.calculator;

/**
 * @author ypb
 * @date 2021/8/11 21:04
 * 测试类
 */
public class Test {
    public static void main(String[] args) {
        Operation operate = OperationFactory.createOperate("+");
        operate.setNumberA(2);
        operate.setNumberB(3);
        System.out.println(operate.getResult());

    }
}
