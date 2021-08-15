package com.ypb.Proxy;

/**
 * @author ypb
 * @date 2021/8/15 19:24
 */
public class Proxy implements Subject{

    private RealSubject realSubject;

    @Override
    public void Request() {
        //此处可以通过构造方法去创建实例
        if(realSubject==null){
            realSubject = new RealSubject();
        }

        realSubject.Request();
    }
}
