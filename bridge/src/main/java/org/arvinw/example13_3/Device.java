package org.arvinw.example13_3;

public abstract class  Device {
    protected Language language;

    public Device(Language language){
        this.language = language;
    }

    public abstract  void voice();
}
