package org.arvinw.reflect_example;

public class Saler implements People{
    @Override
    public void work() {
        System.out.println("Sale something.");

    }

    @Override
    public void eat() {
        System.out.println("Eating fruit.");
    }
}
