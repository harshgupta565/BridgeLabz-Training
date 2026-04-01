import java.util.Scanner;

class Cafe {

    // method to display menu
    static void displayMenu(String[] items) {
        System.out.println("---- Cafeteria Menu ----");
        for (int i = 0; i < items.length; i++) {
            System.out.println(i + " : " + items[i]);
        }
    }

    // method to get item by index
    static String getItemByIndex(String[] items, int index) {
        if (index >= 0 && index < items.length) {
            return items[index];
        } else {
            return "Invalid selection";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 10 fixed items
        String[] menuItems = {
                "Idli",
                "Dosa",
                "Poha",
                "Upma",
                "Sandwich",
                "Burger",
                "Pizza",
                "Pasta",
                "Coffee",
                "Tea"
        };

        // display menu
        displayMenu(menuItems);

        // user input
        System.out.print("\nEnter item index to order: ");
        int choice = sc.nextInt();

        // get selected item
        String orderedItem = getItemByIndex(menuItems, choice);

        System.out.println("You ordered: " + orderedItem);
    }
}
