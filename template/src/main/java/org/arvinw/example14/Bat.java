package org.arvinw.example14;

public class Bat extends Mammal{
    @Override
    public void move() {
        System.out.println("蝙蝠在空中飞着........");
    }

    @Override
    public void eat() {
        System.out.println("抓小虫吃。");
    }
}
