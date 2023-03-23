package org.arvinw.example21_2;

import org.arvinw.example21_1.Bulb;

public class FlashCommand implements Command{

    private Bulb bulb;
    private volatile  boolean neonRun = false;

    public FlashCommand(Bulb bulb){
        this.bulb = bulb;
    }
    @Override
    public void exe() {
        if (!neonRun){
            neonRun = true;
            System.out.println("霓虹灯闪烁任务启动");
            new Thread(() ->{
                try{
                    while (neonRun){
                        bulb.on();
                        Thread.sleep(500);
                        bulb.off();
                        Thread.sleep(500);
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }).start();
        }
    }

    @Override
    public void unexe() {
        neonRun = false;
        System.out.println("霓虹灯闪烁任务结束");
    }
}
