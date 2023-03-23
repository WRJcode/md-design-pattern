package org.arvinw.example23_2;

public abstract class Buyer {

    protected String name;

    public Buyer(String name){
        this.name = name;
    }

    public abstract  void inform(String  product);
}
