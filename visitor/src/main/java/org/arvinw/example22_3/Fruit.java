package org.arvinw.example22_3;

import org.arvinw.example22_1.Product;

import java.time.LocalDate;

public class Fruit extends Product implements Acceptable {

    private float weight;

    public Fruit(String name, LocalDate producedDate, float price,float weight) {
        super(name, producedDate, price);
        this.weight = weight;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
