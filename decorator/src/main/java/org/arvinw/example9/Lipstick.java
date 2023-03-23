package org.arvinw.example9;

public class Lipstick extends Decorator1{
    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show(){
        System.out.print("涂口红【");
        showable.show();
        System.out.print("】");
    }
}

