package com.ypb.Builder;

/**
 * 指挥者（决定执行内容与顺序）
 */
public class Director {

    public void Construct(Builder builder){
        builder.BuildPartA();
        builder.BuildPartB();
    }
}
