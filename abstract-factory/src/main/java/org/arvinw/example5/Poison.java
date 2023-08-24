package org.arvinw.example5;

/**
 * 
 * @author wrjco
 * 具体产品
 *
 */
public class Poison extends MidClassUnit{
    public Poison( int x, int y) {
        super( x, y);
    }

    @Override
    public void show() {
        System.out.println("毒液出现在坐标：（"+x+","+y+")");
    }

    @Override
    public void attack() {
        System.out.println("毒液攻击，攻击力为："+attack);
    }
}
