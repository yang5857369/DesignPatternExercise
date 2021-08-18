package com.ypb.Observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者，也就是微信公众号服务
 * 实现了Observerable接口，并对其方法进行实现
 */
public class WeChatServer implements Observerable {

    private final List<Observer> list;
    String message;

    public WeChatServer() {
        this.list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        list.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        list.remove(o);
    }

    @Override
    public void notifyObserver() {
        for (Observer o :list) {
            o.update(message);
        }
    }

    /**
     * 设置消息推送内容，并发送通知（调用notifyObserver方法）
     * @param s 消息
     */
    public void setInfomation(String s){
        this.message = s;
        System.out.println("微信服务更新消息："+s);
        //消息更新，通知所有观察者
        notifyObserver();
    }
}
