package com.ypb.simpleFactory.calculator;

/**
 * @author ypb
 * @date 2021/8/11 20:43
 * 运算类
 */
public class Operation {

    private double numberA = 0;
    private double numberB = 0;


    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    //此处可以优化
    public double getResult() {
        double result = 0;
        return result;
    }
}
