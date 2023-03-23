package org.arvinw;

public class HungerSun {

    private static final HungerSun sun = new HungerSun();

    private HungerSun(){

    }

    public static HungerSun getInstance(){
        return sun;
    }
}
