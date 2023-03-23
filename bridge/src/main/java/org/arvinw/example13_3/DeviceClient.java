package org.arvinw.example13_3;

public class DeviceClient {
    public static void main(String[] args) {
        new Computer(new Chinese("我是中国人，我爱中国！")).voice();
        new Computer(new English("I am Chinese.I want to earn money.")).voice();

        new Iphone(new Chinese("我现在电脑和手机都登录着")).voice();
        new Iphone(new English("Hello,everyone.")).voice();
    }
}
