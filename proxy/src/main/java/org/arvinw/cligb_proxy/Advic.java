package org.arvinw.cligb_proxy;

public class Advic {
    public void before(){
        System.out.println("对业务核心方法执行前的增强...");
    }
    public void after(){
        System.out.println("对业务核心方法执行后的增强...");
    }
}
