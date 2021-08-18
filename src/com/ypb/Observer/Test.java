package com.ypb.Observer;

/**
 * 测试类：观察者 模式
 * 首先注册了三个用户，ZhangSan、LiSi、WangWu。公众号发布了一条消息"PHP是世界上最好用的语言！"，三个用户都收到了消息。
 *
 * 用户ZhangSan看到消息后颇为震惊，果断取消订阅，这时公众号又推送了一条消息，此时用户ZhangSan已经收不到消息，其他用户
 *
 * 还是正常能收到推送消息。
 */
public class Test {

    public static void main(String[] args) {
        WeChatServer server = new WeChatServer();

        Observer user1 = new User("zhangsan");
        Observer user2 = new User("lisi");
        Observer user3 = new User("wangwu");

        //订阅
        server.registerObserver(user1);
        server.registerObserver(user2);
        server.registerObserver(user3);

        server.setInfomation("PHP是世界上最好的语言");

        System.out.println("--------------------------------------------");
        //看到推送，马上取消订阅
        server.removeObserver(user2);

        server.setInfomation("Java是最好的语言");
    }
}
