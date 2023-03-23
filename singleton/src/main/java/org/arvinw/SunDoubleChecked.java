package org.arvinw;

/**
 * notices:
 *  1.实例变量volatile修饰；保证各线程中该变量的同步性和唯一性
 *  2.内层循环加锁，仅有第一个创建实例
 */
public class SunDoubleChecked {

    private volatile static SunDoubleChecked sun;

    private SunDoubleChecked(){};

    public static SunDoubleChecked getInstance(){
        if (sun == null){
            synchronized (SunDoubleChecked.class){
                if (sun == null){
                    sun = new SunDoubleChecked();
                }
            }
        }
        return sun;
    }
}
