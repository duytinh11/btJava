package practicalexam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product product = new Product();

        System.out.println("=== ENTER PRODUCT INFORMATION ===");

        System.out.print("Enter ID: ");
        product.setId(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter product name: ");
        product.setName(scanner.nextLine());

        System.out.print("Enter thumbnail path: ");
        product.setThumbnail(scanner.nextLine());

        System.out.print("Enter price: ");
        product.setPrice(Double.parseDouble(scanner.nextLine()));

        System.out.print("Enter quantity in stock: ");
        product.setQty(Integer.parseInt(scanner.nextLine()));

        System.out.print("Enter description: ");
        product.setDescription(scanner.nextLine());

        System.out.println("\n");
        product.displayInfo();

        System.out.println("\n=== PLACE AN ORDER ===");
        System.out.print("Enter desired order quantity: ");
        int desiredQty = Integer.parseInt(scanner.nextLine());

        if (product.checkAvailability(desiredQty)) {
            double totalPrice = product.placeOrder(desiredQty);
            System.out.println("-> Order placed successfully!");
            System.out.println("-> Total price: " + totalPrice);
            System.out.println("-> Remaining quantity in stock: " + product.getQty());
        } else {
            System.out.println("-> Order failed: Invalid quantity or insufficient stock.");
        }

    }
}
