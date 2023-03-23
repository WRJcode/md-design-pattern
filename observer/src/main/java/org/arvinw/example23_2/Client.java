package org.arvinw.example23_2;



public class Client {

    /**
     *
     * @param args
     * 观察者模式：又叫发布-订阅模式、模型-视图模式、源-监听器模式或从属者模式，是一种利用订阅者模式解耦的对象行为型模式
     * 观察者模式通常由两个组件组成：主题和观察者
     */
    public static void main(String[] args) {
        Buyer tangSir = new PhoneFans("手机粉");
        Buyer barJee = new HandChopper("剁手族");
        Shop shop = new Shop();

        shop.register(tangSir);
        shop.register(barJee);

        shop.setProduct("猪肉炖粉条");
        shop.setProduct("橘子手机");

    }
}
