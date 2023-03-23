package org.arvinw.example17_7;

public class Client {

    /**
     *
     * @param args
     * @describ 策略模式，角色有抽象策略、具体策略、环境类
     */

    public static void main(String[] args) {
        Computer com = new Computer();

        com.setUSB(new Keyboard());
        com.compute();

        com.setUSB(new Mouse());
        com.compute();

        com.setUSB(new Camera());
        com.compute();
    }
}
