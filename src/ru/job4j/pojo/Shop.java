package ru.job4j.pojo;

public class Shop {
    public static Product[] delete(Product[] products, int index) {
        for (int i = index; i < products.length - 1; i++) {
            products[i] = products[i + 1];
        }
        products[products.length - 1] = null;
        return products;
    }


    public static void main(String[] args) {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        products[2] = new Product("Egg", 19);
        products[3] = new Product("Oil", 2);

        System.out.println("Вывод до работы метода delete");
        for (Product index : products) {
            if (index != null) {
                System.out.println(index.getName());
            } else {
                System.out.println("null");
            }
        }
        System.out.println();

        Shop.delete(products, 3);
        System.out.println("Вывод после работы метода delete");
        for (Product index : products) {
            if (index != null) {
                System.out.println(index.getName());
            } else {
                System.out.println("null");
            }
        }
    }
}