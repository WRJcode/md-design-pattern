package org.arvinw;

/**
 * 线程安全同步方法懒汉式单例模式
 */
public class LazySun_synchronized_method {

    private static LazySun_synchronized_method sun;

    private LazySun_synchronized_method(){};

    public static synchronized LazySun_synchronized_method getInstance(){
        if (sun==null){
            sun = new LazySun_synchronized_method();
        }
        return sun;
    }
}
