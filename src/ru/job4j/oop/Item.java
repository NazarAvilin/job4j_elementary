package ru.job4j.oop;

public class Item {

    public Item() {
        super();
        System.out.println("load item");
    }

    public static void main(String[] args) {
        Item item = new Item();
        Bug bug = new Bug();
    }
}
