package org.arvinw.example23_1;

public class Client {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Buyer shaSir = new Buyer("沙悟净",shop);
        Buyer baJee = new Buyer("猪八戒",shop);

        baJee.buy();
        shaSir.buy();
        baJee.buy();
        shaSir.buy();

        Buyer tangSir = new Buyer("唐玄奘",shop);
        tangSir.buy();

        baJee.buy();
        tangSir.buy();

        shop.setProduct("最新旗舰手机");
        Buyer wuKong = new Buyer("孙悟空",shop);
        wuKong.buy();
    }
}
