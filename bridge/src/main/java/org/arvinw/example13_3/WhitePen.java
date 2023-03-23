package org.arvinw.example13_3;

public class WhitePen extends Pen{

    public WhitePen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("白");
        ruler.regularize();
    }
}
