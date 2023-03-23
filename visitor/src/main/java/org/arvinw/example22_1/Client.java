package org.arvinw.example22_1;

import java.time.LocalDate;

public class Client {

    /**
     *
     *@param args
     * 访问者模式：访问者(Visitor)和元素(Element)。访问者负责定义作用于元素的操作，而元素负责接受访问者的访问；将数据结构和操作分开
     */
    public static void main(String[] args) {
        Candy candy = new Candy("小兔奶糖", LocalDate.of(2019,10,1),20.00f);
        Visitor discountVisitor = new DiscountVisitor(LocalDate.of(2020,1,1));
        discountVisitor.visit(candy);

        Fruit fruit = new Fruit("苹果",LocalDate.of(2020,1,3),15.00f);
        fruit.setWeight(5.5f);
        discountVisitor.visit(fruit);
        System.out.println(discountVisitor);
    }
}
