package org.arvinw.example14;

public class Human {

    public void move(){
        System.out.println("人类在路上开着车......");
    }

    public void eat(){
        System.out.println("去公司挣钱、吃饭。");
    }

    public void live(){
        move();
        eat();
    }
}
