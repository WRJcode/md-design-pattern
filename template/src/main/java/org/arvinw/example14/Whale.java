package org.arvinw.example14;

/**
 * 
 * @author wrjco
 * 改造前对象
 *
 */
public class Whale {

    public void move(){
        System.out.println("鲸在水里游着....");
    }

    public void eat(){
        System.out.println("捕鱼吃");
    }

    public void live(){
        move();
        eat();
    }
}
