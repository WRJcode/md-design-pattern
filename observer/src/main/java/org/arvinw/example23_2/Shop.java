package org.arvinw.example23_2;


import java.util.ArrayList;
import java.util.List;

public class Shop {

    private String product;
    private List<Buyer> buyers;

    public Shop(){
        this.product = "无商品";
        this.buyers = new ArrayList<>();
    }

    public void register(Buyer buyer){
        this.buyers.add(buyer);
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
        notifyBuyers();
    }

    public void notifyBuyers(){
        buyers.stream().forEach(b -> b.inform(this.getProduct()));
    }


}
