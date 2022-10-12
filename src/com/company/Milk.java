package com.company;

public class Milk extends Product implements Drinkable{
    public Milk(String name, String description, String supplier, double price, double quantity) {
        super(name, description, supplier, price, quantity);
    }

    @Override
    public void drink() {
        System.out.printf("Вы выпили молоко: %s, от производителя: %s\n", getName(), getSupplier());
    }
}
