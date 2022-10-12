package com.company;

public class TV extends Product implements Watchable{
    public TV(String name, String description, String supplier, double price, double quantity) {
        super(name, description, supplier, price, quantity);
    }

    @Override
    public void watch() {
        System.out.printf("Вы посмотрели телевизор: %s, от производителя: %s\n", getName(), getSupplier());

    }


}
