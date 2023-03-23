package org.arvinw.example23_1;

public class Buyer {

    private String name;
    private Shop shop;

    public Buyer(String name,Shop shop){
        this.name = name;
        this.shop = shop;
    }


    public void buy(){
        System.out.print(name + "购买：");
        System.out.println(shop.getProduct());
    }
}
