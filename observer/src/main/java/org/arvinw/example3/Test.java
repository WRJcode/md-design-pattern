package org.arvinw.example3;

public class Test {
    public static void main(String[] args) {
        Subject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserve();
        subject.registerObserve(observer);
        subject.registerObserve(observer);
        subject.notifyObservers();
//        subject.removeObserve(observer);
        subject.notifyObservers();
    }
}
