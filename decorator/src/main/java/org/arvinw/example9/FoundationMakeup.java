package org.arvinw.example9;

public class FoundationMakeup extends Decorator1{

    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show(){
        System.out.print("打粉底【");
        showable.show();
        System.out.print("】");
    }
}
