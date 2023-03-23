package org.arvinw.example13;

public abstract class Pen {

    public abstract void getColor();

    public void draw(){
        getColor();
        System.out.print("▲");
    }
}
