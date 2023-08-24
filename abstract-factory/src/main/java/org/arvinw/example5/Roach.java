package org.arvinw.example5;

/**
 * 
 * @author wrjco
 * 具体产品
 *
 */
public class Roach extends LowClassUnit{
    public Roach(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("蟑螂出现在坐标：（"+x+","+y+")");
    }

    @Override
    public void attack() {
        System.out.println("蟑螂用爪子抓，攻击力为："+attack);
    }
}
