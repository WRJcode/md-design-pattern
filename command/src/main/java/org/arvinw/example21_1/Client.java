package org.arvinw.example21_1;

public class Client {

    public static void main(String[] args) {
        Switcher switcher = new Switcher(new Bulb());
        switcher.buttonPush();
        switcher.buttonPop();
    }
}
