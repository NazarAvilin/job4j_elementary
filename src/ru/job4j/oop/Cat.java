package ru.job4j.oop;

public class Cat {

    private String food;
    private String nick;

//    public String sound() {
//        String voice = "may - may";
//        return voice;
//    }

    public void giveNick(String nick) {
        this.nick = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void show() {
        System.out.println("Котик " + this.nick + " кушал " + this.food);
    }

    public static void main(String[] args) {
//        Cat peppy = new Cat();
//        Cat sparky = new Cat();
//        String say = peppy.sound();
//        System.out.println("Peppy says " + say);
//        System.out.println();
//        System.out.println("There are gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Гав");
        gav.eat("котлету");
        gav.show();
//        System.out.println("There are black's food.");
        Cat black = new Cat();
        black.giveNick("Чёрный");
        black.eat("рыбу");
        black.show();
    }
}
