package com.company;

public class Toy extends Product implements Playable{
    public Toy(String name, String description, String supplier, double price, double quantity) {
        super(name, description, supplier, price, quantity);
    }

    @Override
    public void play() {
        System.out.printf("Вы поиграли с %s, от производителя: %s\n", getName(), getSupplier());
    }
}
