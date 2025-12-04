package ItemManager;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ItemManagerImpl itemManager = new ItemManagerImpl();

        itemManager.addItem("Oranges", 0, "Fruits");
        itemManager.addItem("Matcha", 2, "Drink");
        itemManager.addItem("Apple", 10, "Fruits");

//        System.out.println(itemManager.findItem("Apple"));
//        for (Product product : itemManager.getAllItems()) {
//            System.out.printf("|%-20s | %-15s | %5d |\n", product.getName(), product.getCategory(),
//                    product.getQuantity());
//        }

        for (Product product : itemManager.getAllItems()) {
            product.showProductInfo();
        }
        sc.close();
//        while (true) {
//
//        }
    }
}
