package com.ypb.simpleFactory.calculator;

/**
 * @author ypb
 * @date 2021/8/11 20:48
 */
public class Sub extends Operation {

    @Override
    public double getResult() {
        return getNumberA() - getNumberB();
    }
}
