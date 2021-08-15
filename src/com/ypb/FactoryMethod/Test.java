package com.ypb.FactoryMethod;

/**
 * @author ypb
 * @date 2021/8/15 20:01
 * 工厂方法模式，利用工厂创建相应需要的对象工厂，让工厂去创建对象实例并返回
 * 遵从开闭原则：对修改关闭，对扩展开启（在需要扩展新对象时，只需要直接继承接口，不需要修改原有方法）
 * 案例：雷锋与志愿者
 */
public class Test {

    public static void main(String[] args) {
        IFactory factory = new VolunteerFactory();
        LeiFeng leiFeng = factory.CreateLeiFeng();
        leiFeng.buyRice();
    }
}
