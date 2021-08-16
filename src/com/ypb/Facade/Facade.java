package com.ypb.Facade;

public class Facade {

    SubSystem1 one;
    SubSystem2 two;
    SubSystem3 three;
    SubSystem4 four;

    public Facade() {
        this.one = new SubSystem1();
        this.two = new SubSystem2();
        this.three = new SubSystem3();
        this.four = new SubSystem4();
    }

    public void MethodA(){
        System.out.println("方法组A");
        one.method1();
        two.method2();
        three.method3();
    }

    public void MethodB(){
        System.out.println("方法组B");

        two.method2();
        three.method3();
    }
}
