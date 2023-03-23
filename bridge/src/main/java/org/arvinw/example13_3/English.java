package org.arvinw.example13_3;

public class English extends Language{

    public English(String message) {
        super(message);
    }

    @Override
    protected void content() {
        System.out.println("English:"+this.message);
    }
}
