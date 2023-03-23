package org.arvinw.example22_1;

import java.text.NumberFormat;
import java.time.LocalDate;

public class DiscountVisitor implements Visitor{

    private LocalDate billDate;

    public DiscountVisitor(LocalDate localDate){
        this.billDate = localDate;
    }


    @Override
    public void visit(Candy candy) {

        System.out.println("==============糖果【" + candy.getName() + "】打折后价格=========");
        float rate = 0;
        long days = billDate.toEpochDay() - candy.getProducedDate().toEpochDay();
        if (days > 180){
            System.out.println("超过半年的糖果，请勿食用");
        } else {
            rate = 0.9f;
        }
        float discountPrice = candy.getPrice() * rate;
        System.out.println(NumberFormat.getCurrencyInstance().format(discountPrice));

    }

    @Override
    public void visit(Wine wine) {
        System.out.println("===========酒【" + wine.getName() + "】无折扣价格=======");
        System.out.println(NumberFormat.getCurrencyInstance().format(wine.getPrice()));
    }

    @Override
    public void visit(Fruit fruit) {
        System.out.println("============水果【" + fruit.getName() + "】打折后价格============");
        float rate = 0;
        long days = billDate.toEpochDay() - fruit.getProducedDate().toEpochDay();
        if (days > 7){
            System.out.println("￥0.00就（超过7天的水果，请勿食用！）");
        } else if (days > 3) {
            rate = 0.5f;
        } else {
            rate = 1;
        }
        float discountPrice = fruit.getPrice()  * fruit.getWeight() * rate;
        System.out.println(NumberFormat.getCurrencyInstance().format(discountPrice));
    }
}
