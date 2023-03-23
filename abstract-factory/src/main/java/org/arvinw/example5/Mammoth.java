package org.arvinw.example5;

public class Mammoth extends HighClassUnit{
    public Mammoth( int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("猛犸出现在坐标：（"+x+","+y+")");
    }

    @Override
    public void attack() {
        System.out.println("猛犸冲撞攻击，攻击力为："+attack);
    }
}
