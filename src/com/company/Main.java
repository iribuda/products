package com.company;

public class Main {

    public static void main(String[] args) {
        Toy toy = new Toy("Фрисби", "beauty black color", "Черноголовка", 667, 69);
        Milk milk = new Milk("Веселый молочник", "веселит", "ВиммБильДанн", 150, 150);
        TV tv = new TV("GT-4923xxxtentacionmegasuper", "Dolby atmosphere", "Samsung", 1599.99, 3);


        toy.play();
        milk.drink();
        tv.buy();
        tv.watch();
    }
}
