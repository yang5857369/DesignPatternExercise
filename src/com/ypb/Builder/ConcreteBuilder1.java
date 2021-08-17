package com.ypb.Builder;

public class ConcreteBuilder1 implements Builder {

    private Product product = new Product();

    @Override
    public void BuildPartA() {
        product.add("部件A");
    }

    @Override
    public void BuildPartB() {
        product.add("部件B");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
