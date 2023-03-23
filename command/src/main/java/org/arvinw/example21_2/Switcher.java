package org.arvinw.example21_2;

public class Switcher {

    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void buttonPush(){
        System.out.println("按下按钮........");
        command.exe();
    }

    public void buttonPop(){
        System.out.println("弹起按钮.......");
        command.unexe();
    }
}
