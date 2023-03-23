package org.arvinw.example13_3;

public class Iphone extends Device{

    public Iphone(Language language) {
        super(language);
    }

    @Override
    public void voice() {
        System.out.println("Computer voice:");
        language.content();
    }
}
