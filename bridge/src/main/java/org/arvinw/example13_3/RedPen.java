package org.arvinw.example13_3;

public class RedPen extends Pen{

    public RedPen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("红");
        ruler.regularize();
    }
}
