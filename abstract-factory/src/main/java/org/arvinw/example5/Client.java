package org.arvinw.example5;

public class Client {
    /**
     *
     * @param args
     * @describ 抽象工厂，角色有抽象工厂、具体工厂、抽象产品、具体产品
     */
    public static void main(String[] args) {
        System.out.println("游戏开始");
        System.out.println("双方开始挖矿");

        System.out.println("工人建造人类工厂");
        AbstractFactory factory = new HumanFactory(10,10);

        Unit marine = factory.createLowClass();
        marine.show();

        Unit tank = factory.createMidClass();
        tank.show();

        Unit ship = factory.createHighClass();
        ship.show();

        System.out.println("工蜂制造外星怪兽工厂");
        factory = new AlienFactory(200,200);

        Unit roach = factory.createLowClass();
        roach.show();

        Unit poison = factory.createMidClass();
        poison.show();

        Unit mammoth = factory.createHighClass();
        mammoth.show();

        System.out.println("两族开始大乱斗");
        marine.attack();
        roach.attack();
        poison.attack();
        tank.attack();
        mammoth.attack();
        ship.attack();
    }
}
