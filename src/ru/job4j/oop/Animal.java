package ru.job4j.oop;

public class Animal {
    private String name;

    public Animal() {
        super();
        System.out.println(name);
    }

    public Animal(String name) {
        this.name = name;
    }


    public static void main(String[] args) {
        Animal animal = new Animal();
        Predator predator = new Predator();
        Tiger tiger = new Tiger();
    }
}
