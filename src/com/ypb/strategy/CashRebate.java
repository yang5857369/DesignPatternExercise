package com.ypb.strategy;

/**
 * @author ypb
 * @date 2021/8/12 20:07
 */
public class CashRebate extends CashSuper {
    /**
     * 打折算法
     *
     * @return
     */
    @Override
    public double acceptCash() {
        return 0.2d;

    }
}
