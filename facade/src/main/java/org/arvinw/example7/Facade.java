package org.arvinw.example7;

public class Facade {
    /**
     * 外观模式：为多个复杂的子系统提供一个一致的接口，使这些子系统更加容易被访问。
     * 为一组接口提供一个一致界面，定义了更高一层接口。其目的让子系统更容易被调用。
     */

    private VegVendor vegVendor;
    private Chef chef;
    private Waiter waiter;
    private Cleaner cleaner;

    public Facade(){
        this.vegVendor = new VegVendor();
        vegVendor.purchase();
        this.chef = new Chef();
        this.waiter = new Waiter();
        this.cleaner = new Cleaner();
    }

    public void order(){
        waiter.order();
        chef.cook();
        waiter.serve();
        cleaner.clean();
        cleaner.wash();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.order();
    }

}
