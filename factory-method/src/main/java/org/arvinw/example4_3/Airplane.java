package org.arvinw.example4_3;

/**
 * 
 * @author wrjco
 * 具体产品
 *
 */
public class Airplane extends Enemy{

    public Airplane(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("绘制");
        System.out.println("发起进攻");
    }
}
