package org.arvinw.example17;

public class Calculator {

    private Strategy strategy;

    public void setStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public int getResult(int a,int b){
        return this.strategy.calculate(a,b);
    }
}
