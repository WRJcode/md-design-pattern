package org.arvinw.example4_3;

/**
 * 
 * @author wrjco
 * 工厂方法模式客户端
 *
 */
public class Client {
    /**
     *
     * @param args
     * @describ 工厂方法，思想是将”产品“和”生产“解耦，角色一般有工厂、抽象产品、具体产品
     */

    public static void main(String[] args) {
        System.out.println("游戏开始");
        SimpleFactory factory = new SimpleFactory(100);
        factory.create("Airplane").show();
        factory.create("Tank").show();
    }
}
