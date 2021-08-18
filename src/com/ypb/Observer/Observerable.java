package com.ypb.Observer;

import java.util.ArrayList;
import java.util.List;


/**
 * 主题或抽象通知者（被观察者接口）
 * 声明了添加、删除、通知观察者方法
 */
public interface Observerable {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObserver();

}
