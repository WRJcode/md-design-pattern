package org.arvinw.example7;

public class Client {

    public void eat(){
        System.out.println("开始用餐");

    }

    public void wash(){
        System.out.println("洗碗...");
    }

    public static void main(String[] args) {

        VegVendor vegVendor = new VegVendor();
        vegVendor.purchase();

        Helper helper = new Helper();
        helper.cook();

        Client client = new Client();
        client.eat();
        client.wash();
    }
}
