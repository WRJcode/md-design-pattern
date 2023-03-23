package org.arvinw.example17_7;

public class Computer {

    private USB usb;

    public void setUSB(USB usb){
        this.usb = usb;
    }

    public void compute(){
        usb.read();
    }
}
