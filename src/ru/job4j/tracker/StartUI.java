package ru.job4j.tracker;

public class StartUI {

       public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.parseInt(input.askStr("Enter No.: "));
            switch (select) {
                case 0 -> StartUI.createItem(input, tracker);
                case 1 -> StartUI.showItems(input, tracker);
                case 2 -> StartUI.replaceItem(input, tracker);
                case 3 -> StartUI.deleteItem(input, tracker);
                case 4 -> StartUI.findItemById(input, tracker);
                case 5 -> StartUI.findItemByName(input, tracker);
                default -> {
                    System.out.println("==== Exit Program ====");
                    run = false;
                }
            }
//            if (select == 0) {
//                StartUI.createItem(input, tracker);
//            } else if (select == 1) {
//                StartUI.showItems(input, tracker);
//            } else if (select == 2) {
//                StartUI.editItem(input, tracker);
//            } else if (select == 3) {
//                StartUI.deleteItem(input, tracker);
//            } else if (select == 4) {
//                StartUI.findItemById(input, tracker);
//            } else if (select == 5) {
//                StartUI.findItemByName(input, tracker);
//            } else if (select == 6) {
//                System.out.println("==== Exit Program ====");
//                run = false;
//            }
        }
    }

    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        System.out.print("Enter name: ");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
    }

    public  static void showItems(Input input, Tracker tracker) {
        System.out.println("==== Show all items ====");
        Item[] temp = tracker.findAll();
        if (temp.length == 0) {
            System.out.println("No records");
        }
        for (Item item : temp) {
            System.out.println(item);
        }
    }

    public  static void replaceItem(Input input, Tracker tracker) {
        System.out.println("==== Replace item ====");
        String id = input.askStr("Enter id: ");
        String name = input.askStr("Enter the item's name: ");
        Item item = new Item(name);
        item.setId(id);
        if (tracker.replace(id, item)) {
            System.out.print("Completed");
        } else {
            System.out.print("Not completed");
        }
    }

    public  static void deleteItem(Input input, Tracker tracker) {
        System.out.println("==== Delete item ====");
        String nameId = input.askStr("Enter id: ");
        if (tracker.delete(nameId)) {
            System.out.print("Completed");
        } else {
            System.out.print("Not completed");
        }
    }

    public  static void findItemById(Input input, Tracker tracker) {
        System.out.println("==== Find item by Id ====");
        System.out.print("Enter id: ");
        String id = input.askStr("Enter id: ");
        Item tempid = tracker.findById(id);
        if (tempid == null) {
            System.out.println("ID not found");
        } else {
            System.out.println(tempid);
        }
    }

    public  static void findItemByName(Input input, Tracker tracker) {
        System.out.println("==== Find items by name ====");
        System.out.print("Enter name: ");
        String name = input.askStr("Enter name: ");
        Item[] tempName = tracker.findByName(name);
        for (Item item : tempName) {
            System.out.println(item);
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select: ");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }

}