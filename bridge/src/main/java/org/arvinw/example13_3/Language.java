package org.arvinw.example13_3;

public abstract class Language {

    public String message;

    public Language(String message) {
        this.message = message;
    }

    protected abstract void content();
}
