package org.arvinw.example21_2;


import org.arvinw.example21_1.Bulb;

public class Client {
    /**
     *
     * @param args
     * @throws InterruptedException
     * 命令模式：角色有命令、命令接收者、命令请求者、命令发起者
     */

    public static void main(String[] args) throws InterruptedException {

        Switcher switcher = new Switcher();
        Bulb bulb = new Bulb();
        Command switchCommand = new SwitchCommand(bulb);

        switcher.setCommand(switchCommand);

        switcher.buttonPush();
        switcher.buttonPop();


        switcher.setCommand(new FlashCommand(bulb));

        switcher.buttonPush();
        Thread.sleep(3000);
        switcher.buttonPop();

    }
}
