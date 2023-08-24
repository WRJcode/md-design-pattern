package org.arvinw.example14;

/**
 * 
 * @author wrjco
 * 模板具体实现
 *
 */
public class Human1 extends Mammal{
    @Override
    public void move() {
        System.out.println("人类在路上开着车......");
    }

    @Override
    public void eat() {
        System.out.println("去公司挣钱吃饭。");
    }
}
