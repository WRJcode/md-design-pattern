package org.arvinw.example4_3;

public class Tank extends Enemy{
    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("绘制坦克在地图上图层");
        System.out.println("坦克攻击玩家");
    }
}
