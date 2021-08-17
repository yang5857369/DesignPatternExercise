package com.ypb.Strategy;

/**
 * @author ypb
 * @date 2021/8/12 20:09
 */
public class CashReturn extends CashSuper {
    /**
     * 返利算法
     *
     * @return
     */
    @Override
    public double acceptCash() {
        return 0.3d;
    }
}
