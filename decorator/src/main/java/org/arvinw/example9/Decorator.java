package org.arvinw.example9;

public class Decorator implements Showable{

    Showable showable;

    public Decorator(Showable showable){
        this.showable = showable;
    }

    @Override
    public void show() {

        System.out.print("粉饰【");
        showable.show();
        System.out.print("】");
    }
}
