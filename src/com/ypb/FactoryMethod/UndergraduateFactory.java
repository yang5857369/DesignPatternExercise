package com.ypb.FactoryMethod;

/**
 * @author ypb
 * @date 2021/8/15 20:10
 * 学雷锋大学生工厂类
 */
public class UndergraduateFactory implements IFactory{


    @Override
    public LeiFeng CreateLeiFeng() {
        return new Undergraduate();
    }
}
