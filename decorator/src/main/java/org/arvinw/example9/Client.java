package org.arvinw.example9;

public class Client {

    /**
     *
     * @param args
     * 装饰模式：装饰类、被装饰类、装饰接口
     */

    public static void main(String[] args) {
        new Decorator(new Girl()).show();

        System.out.println(" ");
        System.out.println("----------------------------------------");

        Showable madeUpGirl = new Lipstick(new FoundationMakeup(new Girl()));
        madeUpGirl.show();
    }
}
