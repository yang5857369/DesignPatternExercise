package com.ypb.Strategy;

/**
 * @author ypb
 * @date 2021/8/12 20:10
 * 策略模式
 * 案例：超市打折案例
 */
public class Test {
    public static void main(String[] args) {
        CashContext context = new CashContext(new CashNormal());
        double result = context.getResult(100);
        System.out.println(result);
    }
}
