package org.arvinw.example13_3;

public class Chinese extends Language {

    public Chinese(String message) {
        super(message);
    }

    @Override
    protected void content() {
        System.out.println("Chinese"+this.message);
    }
}
