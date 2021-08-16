package com.ypb.TemplateMethod;

class concreteClassA implements AbstractClass {


    @Override
    public void primitiveOperation1() {
        System.out.println("A类实现1方法");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("A类实现2方法");
    }
}

class concreteClassB implements AbstractClass {


    @Override
    public void primitiveOperation1() {
        System.out.println("B类实现1方法");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("B类实现2方法");
    }
}
