package org.arvinw;

public class LazySun {

    private static LazySun sun;

    private LazySun(){};

    public static LazySun getInstance(){
        if (sun == null){
            sun = new LazySun();
        }
        return sun;
    }

}
