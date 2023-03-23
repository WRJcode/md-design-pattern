package org.arvinw.example18_3;

public class Client {

    /**
     *
     * @param args
     * 状态模式：由状态接口、状态类、上下文类组成，本例中State为状态接口，
     * Red、Yellow、Green为状态类，TrafficLight1为上下文类持有状态对象
     * 其内部状态会发生变化，同时此状态的实现方法也不相同
     */

    public static void main(String[] args) {
        TrafficLight1 trafficLight1 = new TrafficLight1();
        trafficLight1.switchToYellow();
        trafficLight1.switchToGreen();
        trafficLight1.switchToYellow();
        trafficLight1.switchToRed();
        trafficLight1.switchToGreen();

    }
}
