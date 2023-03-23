package org.arvinw.example13_3;

public abstract class Pen {

    protected Ruler ruler;

    public Pen(Ruler ruler){
        this.ruler = ruler;
    }

    public abstract  void draw();
}
