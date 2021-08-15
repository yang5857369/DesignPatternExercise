package com.ypb.simpleFactory.calculator;

/**
 * @author ypb
 * @date 2021/8/11 20:48
 */
public class Div extends Operation{

    @Override
    public double getResult() {
        try {
            return getNumberA()/getNumberB();
        }catch (Exception e){
            e.getStackTrace();
        }
        return 0;
    }
}
