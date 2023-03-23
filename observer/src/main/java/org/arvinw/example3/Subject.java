package org.arvinw.example3;

public interface Subject {
    //注册观察者
    void registerObserve(Observer observer);

    //删除观察者
    void removeObserve(Observer observer);

    //通知观察者
    void notifyObservers();
}
