package com.ypb.TemplateMethod;

/**
 * @author ypb
 * @Date 2021年8月16日19:33:52
 * 抽象模板
 */
public interface AbstractClass {

    void primitiveOperation1();
    void primitiveOperation2();

    default void TemplateMethod(){
        primitiveOperation1();
        primitiveOperation2();
        System.out.println("模板方法，推迟到子类实现");
    }
}
