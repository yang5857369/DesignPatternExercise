package com.ypb.strategy;

/**
 * @author ypb
 * @date 2021/8/12 19:47
 */
public class CashContext {

    private CashSuper cs;

    public CashContext(CashSuper cs) {
        this.cs = cs;
    }

    public double getResult(double money){
        return cs.acceptCash();
    }
}
