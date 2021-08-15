package com.ypb.simpleFactory.calculator;

/**
 * @author ypb
 * @date 2021/8/11 20:53
 * 实现简单工厂类
 */
public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new Add();
                break;
            case "-":
                operation = new Sub();
                break;
            case "*":
                operation = new Mul();
                break;
            case "/":
                operation = new Div();
                break;
        }
        return operation;
    }
}
