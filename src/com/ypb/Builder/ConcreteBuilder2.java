package com.ypb.Builder;

public class ConcreteBuilder2 implements Builder{

    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.add("部件X");
    }

    @Override
    public void BuildPartB() {
        product.add("部件Y");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
