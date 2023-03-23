package org.arvinw.example21_2;

import org.arvinw.example21_1.Bulb;

public class SwitchCommand implements Command{

    private Bulb bulb;

    public SwitchCommand(Bulb bulb){
        this.bulb = bulb;
    }

    @Override
    public void exe() {
        bulb.on();
    }

    @Override
    public void unexe() {
        bulb.off();
    }
}
