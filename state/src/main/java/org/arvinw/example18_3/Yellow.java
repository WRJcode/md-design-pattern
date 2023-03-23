package org.arvinw.example18_3;

public class Yellow implements State{
    @Override
    public void switchToGreen(TrafficLight1 trafficLight1) {
        trafficLight1.setState(new Green());
        System.out.println("OK.......绿灯亮起60秒");
    }

    @Override
    public void switchToYellow(TrafficLight1 trafficLight1) {
        System.out.println("ERROR!!!!已是黄灯状态无须再切换");

    }

    @Override
    public void switchToRed(TrafficLight1 trafficLight1) {
        trafficLight1.setState(new Red());
        System.out.println("OK.......红灯亮起60秒");
    }
}
