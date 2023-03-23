package org.arvinw.example22_3;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class Client {


    public static void main(String[] args) {

        List<Acceptable> products = Arrays.asList(
                new Candy("小白兔奶糖", LocalDate.of(2018,10,1),20.00f),
                new Wine("老猫白酒",LocalDate.of(2017,1,1),1000.00f),
                new Fruit("草莓",LocalDate.of(2018,12,26),10.00f,2.5f)
        );

        Visitor discountVisitor = new DiscountVisitor(LocalDate.of(2019,1,1));

        for (Acceptable product:products){
            product.accept(discountVisitor);
        }
    }
}
