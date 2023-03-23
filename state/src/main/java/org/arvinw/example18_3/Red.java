package org.arvinw.example18_3;

public class Red implements State{
    @Override
    public void switchToGreen(TrafficLight1 trafficLight1) {
        System.out.println("ERROR!!!红灯不能切换为绿灯");
    }

    @Override
    public void switchToYellow(TrafficLight1 trafficLight1) {
        trafficLight1.setState(new Yellow());
        System.out.println("OK.........黄灯亮起5秒");
    }

    @Override
    public void switchToRed(TrafficLight1 trafficLight1) {
        System.out.println("ERROR!!!已是红灯状态无须再切换");
    }
}
