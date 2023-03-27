package org.arvinw.example13_3;

public class Client {

    /**
     *
     * @param args
     * 桥接模式：将抽象部分与实现部分分离，通常用一个抽象类作为桥
     * 本案例中，Pen作为桥，将其实现类与抽象Ruler“桥接”到一起，灵活又解耦
     */

    public static void main(String[] args) {
        new WhitePen(new SquareRuler()).draw();
        new WhitePen(new TriangleRuler()).draw();
        new WhitePen(new CircleRuler()).draw();
        new WhitePen(new OtherRuler()).draw();

        new BlackPen(new SquareRuler()).draw();
        new BlackPen(new TriangleRuler()).draw();
        new BlackPen(new CircleRuler()).draw();
        new BlackPen(new OtherRuler()).draw();

         new RedPen(new SquareRuler()).draw();
         new RedPen(new CircleRuler()).draw();
    }
}
