package com.ypb.Strategy;

/**
 * @author ypb
 * @date 2021/8/12 20:04
 */
public class CashNormal extends CashSuper {
    /**
     * 正常算法
     *
     * @return
     */
    @Override
    public double acceptCash() {
        return 0.1d;
    }
}
