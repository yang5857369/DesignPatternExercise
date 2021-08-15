package com.ypb.simpleFactory.calculator;

/**
 * @author ypb
 * @date 2021/8/11 20:46
 */
public class Add extends Operation {

    @Override
    public double getResult() {
        return super.getNumberA() + super.getNumberB();
    }
}
