package com.ypb.Builder;

/**
 * @author ypb
 * @Date 2021年8月17日20:32:11
 * 建造者模式
 *
 */
public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();
        Builder b2 = new ConcreteBuilder2();

        //指挥者-->具体建造者A-->调用A重写的建造者接口的方法
        director.Construct(b1);
        //得到结果
        Product p1 = b1.getResult();
        //显示
        p1.show();

        director.Construct(b2);
        Product p2 = b2.getResult();
        p2.show();

    }
}
