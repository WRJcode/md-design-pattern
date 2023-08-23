package org.arvinw;

/**
 * 饿汉式单例模式
 */
public class HungerSun {

    private static final HungerSun sun = new HungerSun();

    private HungerSun(){

    }

    public static HungerSun getInstance(){
        return sun;
    }
}
