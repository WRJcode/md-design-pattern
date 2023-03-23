package org.arvinw.example3;

public class ConcreteObserve implements Observer{
    @Override
    public void update(String message) {
        System.out.println("receive message:" + message);
    }
}
