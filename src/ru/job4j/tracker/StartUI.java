package ru.job4j.tracker;

public class StartUI {

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.println("Select: ");
            int select = Integer.parseInt(input.askStr("Enter No.: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.println("Enter name: ");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("==== Show all items ====");
                Item[] temp = tracker.findAll();
                if (temp.length == 0) {
                    System.out.println("No records");
                } else {
                    for (Item item : temp) {
                        System.out.println(item);
                    }
                }
            } else if (select == 2) {
                System.out.println("==== Edit item ====");
                System.out.println("Enter id: ");
                String nameId = input.askStr("Enter nameId: ");
                System.out.print("Enter replays name: ");
                String nameNew = input.askStr("Enter new name: ");
                Item item = new Item(nameNew);
                if (tracker.replace(nameId, item)) {
                    System.out.print("Completed");
                } else {
                    System.out.print("Not completed");
                }
            } else if (select == 3) {
                System.out.println("==== Delete item ====");
                System.out.println("Enter id: ");
                String nameId = input.askStr("Enter nameId: ");
                if (tracker.delete(nameId)) {
                    System.out.print("Completed");
                } else {
                    System.out.print("Not completed");
                }
            } else if (select == 4) {
                System.out.println("==== Find item by Id ====");
                System.out.println("Enter id: ");
                String id = input.askStr("Enter id: ");
                Item tempid = tracker.findById(id);
                if (tempid == null) {
                    System.out.println("ID not found");
                } else {
                    System.out.println(tempid);
                }
            } else if (select == 5) {
                System.out.println("==== Find items by name ====");
                System.out.println("Enter name: ");
                String name = input.askStr("Enter name: ");
                if (!name.equals("")) {
                    Item[] tempName = tracker.findByName(name);
                    for (Item item : tempName) {
                        System.out.println(item);
                    }
                }
            } else if (select == 6) {
                System.out.println("==== Exit Program ====");
                run = false;
            }
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
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }


//    public void init(Input input, Tracker tracker, UserAction[] actions) {
//        boolean run = true;
//        while (run) {
//            this.showMenu(actions);
//            int select = input.askInt("Select: ");
//            UserAction action = actions[select];
//            run = action.execute(input, tracker);
//        }
//    }
//
//    private void showMenu(UserAction[] actions) {
//        System.out.println("Menu.");
//        for (int index = 0; index < actions.length; index++) {
//            System.out.println(index + ". " + actions[index].name());
//        }
//    }
//
//    public static void main(String[] args) {
//        Input input = new ConsoleInput();
//        Tracker tracker = new Tracker();
//        UserAction[] actions = {
//                new CreateAction()
//        };
//        new StartUI().init(input, tracker, actions);
//    }
}