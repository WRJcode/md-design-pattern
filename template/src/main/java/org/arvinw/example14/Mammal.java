package org.arvinw.example14;

/**
 * 
 * @author wrjco
 * 模板
 *
 */
public abstract class Mammal {

    public abstract void move();

    public abstract void eat();

    public final void live(){
        move();
        eat();
    }
}
