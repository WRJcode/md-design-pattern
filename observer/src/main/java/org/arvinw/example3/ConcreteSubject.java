package org.arvinw.example3;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject{

    List<Observer> observers;

    public ConcreteSubject(){
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserve(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserve(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer:observers){
            observer.update("data changed!");
        }
    }
}
