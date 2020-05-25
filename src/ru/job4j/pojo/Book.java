package ru.job4j.pojo;

public class Book {
    private String name;
    private int pages;

    public Book() { }
    public Book(String name, int pages) {
        this.name = name;
        this.pages = pages;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPage() {
        return pages;
    }
    public void setPage(int pages) {
        this.pages = pages;
    }
}