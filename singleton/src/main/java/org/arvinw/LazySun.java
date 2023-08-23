package org.arvinw;

/**
 * 懒汉式单例模式
 */
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
