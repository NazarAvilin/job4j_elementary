package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Happy end", 376);
        Book book2 = new Book("Bible", 400);
        Book book3 = new Book("Clean code", 350);
        Book book4 = new Book("Effective Java", 318);

        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        System.out.println("Начальный список ");
        for (Book getBook : books) {
            System.out.println(getBook.getName() + " - " + getBook.getPage());
        }
        System.out.println();

        Book tmp = books[0];
        books[0] = books[2];
        books[2] = tmp;
        System.out.println("Список после перемещения книг");
        for (Book getBook : books) {
            System.out.println(getBook.getName() + " - " + getBook.getPage());
        }
        System.out.println();

        System.out.println("Список книг по выбору");
        for (Book getBook : books) {
            if (getBook.getName().equals("Clean code")) {
                System.out.println(getBook.getName() + " - " + getBook.getPage());
            }
        }
    }
}