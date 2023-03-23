package org.arvinw.example13_3;

public class Computer extends Device{


    public Computer(Language language) {
        super(language);
    }

    @Override
    public void voice() {
        System.out.println("Computer voice:");
        language.content();
    }
}
