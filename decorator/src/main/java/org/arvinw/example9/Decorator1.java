package org.arvinw.example9;

public abstract class Decorator1 implements  Showable{

    protected Showable showable;

    public Decorator1(Showable showable){
        this.showable = showable;
    }

    @Override
    public void show(){
        showable.show();
    }
}
