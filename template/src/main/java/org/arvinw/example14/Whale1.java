package org.arvinw.example14;

/**
 * 
 * @author wrjco
 * 模板具体实现
 *
 */
public class Whale1 extends Mammal{
    @Override
    public void move() {
        System.out.println("鲸鱼在水中游着........");
    }

    @Override
    public void eat() {
        System.out.println("捕鱼吃。");
    }
}
