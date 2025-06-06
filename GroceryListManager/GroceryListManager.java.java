import java.util.ArrayList;
import java.util.Scanner;

public class GroceryListManager {
    public static void main(String[] args) {
        ArrayList<String> groceryList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nGrocery List Manager");
            System.out.println("1. Add item");
            System.out.println("2. Remove item");
            System.out.println("3. View list");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");

            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Enter the item to add: ");
                String item = scanner.nextLine();
                groceryList.add(item);
                System.out.println("'" + item + "' added to the list!");
            }
            else if (choice.equals("2")) {
                if (groceryList.isEmpty()) {
                    System.out.println("The list is empty!");
                } else {
                    System.out.print("Enter the item to remove: ");
                    String item = scanner.nextLine();
                    if (groceryList.contains(item)) {
                        groceryList.remove(item);
                        System.out.println("'" + item + "' removed from the list!");
                    } else {
                        System.out.println("'" + item + "' not found in the list.");
                    }
                }
            }
            else if (choice.equals("3")) {
                if (groceryList.isEmpty()) {
                    System.out.println("The list is empty!");
                } else {
                    System.out.println("\nYour Grocery List:");
                    for (int i = 0; i < groceryList.size(); i++) {
                        System.out.println((i + 1) + ". " + groceryList.get(i));
                    }
                }
            }
            else if (choice.equals("4")) {
                System.out.println("Exiting the program. Happy shopping!");
                break;
            }
            else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}