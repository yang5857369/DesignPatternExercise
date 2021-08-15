package com.ypb.Proxy;

/**
 * @author ypb
 * @date 2021/8/15 19:22
 */
public class RealSubject implements Subject {


    @Override
    public void Request() {

        System.out.println("真正的请求");
    }
}
