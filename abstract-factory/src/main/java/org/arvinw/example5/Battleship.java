package org.arvinw.example5;

/**
 * 
 * @author wrjco
 * 具体产品
 *
 */
public class Battleship extends HighClassUnit{
    public Battleship( int x, int y) {
        super( x, y);
    }

    @Override
    public void show() {
        System.out.println("战舰出现在坐标：（"+x+","+y+")");
    }

    @Override
    public void attack() {
        System.out.println("战舰用激光炮打击，攻击力为："+attack);
    }
}
