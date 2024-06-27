// File name: Nuestra Cocina restuarant menu

// Written by: Steven Gonzalez

// Sart date: 09/07/2023


// Import the necessary libraries
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NuestraCocinaMenu {

    // Define the constants for the food prices
    private static final double BURRITOS_PRICE = 4.99; // The price of a burrito
    private static final double TACOS_PRICE = 2.49; // The price of a taco
    private static final double TOSTADAS_PRICE = 3.99; // The price of a tostada
    private static final double TAMALES_PRICE = 2.49; // The price of a tamale
    private static final double MEXICAN_PIZZA_PRICE = 3.99; // The price of a Mexican pizza
    private static final double TACO_SALAD_PRICE = 2.99; // The price of a taco salad
    private static final double SOFT_DRINK_PRICE = 1.99; // The price of a soft drink
    private static final double BEER_PRICE = 4.00; // The price of a beer

    // Define the variables for the order
    private static int burritos = 0; // The number of burritos ordered
    private static int tacos = 0; // The number of tacos ordered
    private static int tostadas = 0; // The number of tostadas ordered
    private static int tamales = 0; // The number of tamales ordered
    private static int mexicanPizza = 0; // The number of Mexican pizzas ordered
    private static int tacoSalad = 0; // The number of taco salads ordered
    private static int softDrink = 0; // The number of soft drinks ordered
    private static int beer = 0; // The number of beers ordered
    private static double total = 0.0; // The total price of the order
    private static double SALES_TAX = 0.075; // The sales tax rate

    // Create a Scanner object to read user input
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a new instance of the NuestraCocinaMenu class
        NuestraCocinaMenu menu = new NuestraCocinaMenu();

        // Display the menu
        menu.displayMenu();

        // Take the order from the user
        menu.menu();

        // Calculate the total price of the order
        menu.calculateTotal(total, SALES_TAX);

        // Create the bill and add the READ only file here
        menu.createBill();
    }

    private static void displayMenu() {
        // Print a welcome message
        System.out.println("********** Welcome to Nuesta Cocina *************");

        // Print the menu items
        System.out.println("***************************************************");

        System.out.println(" 1.Burritos 4.99/-");

        System.out.println(" 2.Tacos 2.49/-");

        System.out.println(" 3.Tostadas 3.99/-");

        System.out.println(" 4.Tamales 2.49/-");

        System.out.println(" 5.Mexican Pizza 3.99/-");

        System.out.println(" 6.Taco Salad 2.99/-");

        System.out.println(" 7.Soft Drink 1.99/-");

        System.out.println(" 8.Beer 4.00/-");

        System.out.println(" 9.End of Order ");

        System.out.println("***************************************************");

        // Ask the user what they would like to order
        System.out.println("\nWhat would you like to order today? ");
    }

    private static void createBill() {

        // Calculate the total price of the order with sales tax
        double totalPrice = calculateTotal(total, SALES_TAX);

        // Print the bill
        System.out.println("\n***************Your total bill is: $" + totalPrice
                + "******************");

        System.out.println("\n*******Thank you for your order. Have a great day!!!******");

        // Create a new FileWriter object to write the bill to a file
        try {
            FileWriter writer = new FileWriter("/home/user/Desktop/bill.txt");
            
            // Write the total price of the order to the file
            writer.write("Your total bill is: $" + calculateTotal(total, SALES_TAX));
           
            // Close the FileWriter
            writer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static double calculateTotal(double price, double salesTax) {
        // Calculate the total price of the order with sales tax
        return price + (price * salesTax);
    }

    private static void menu() {
        Scanner sc = new Scanner(System.in);
        double totalPrice;

        // Loop until the user selects the "End of Order" option
        while (true) {
            System.out.print("Enter your food item ");
            int ch = sc.nextInt();

            // Switch statement to handle the user's selection
            switch (ch) {
                case 1:
                    System.out.println("You have ordered a burrito ");
                    System.out.println();
                    System.out.println("How many burritos would you like? ");
                    int num = sc.nextInt();
                    total = total + num * BURRITOS_PRICE;
                    break;
                case 2:
                    System.out.println("You have ordered a Taco ");
                    System.out.println();
                    System.out.println("How many Tacos would you like? ");
                    num = sc.nextInt();
                    total = total + num * TACOS_PRICE;
                    break;
                case 3:
                    System.out.println("You have ordered a Tostada ");
                    System.out.println();
                    System.out.println("How many Tostadas would you like? ");
                    num = sc.nextInt();
                    total = total + num * TOSTADAS_PRICE;
                    break;
                case 4:
                    System.out.println("You have ordered Tamales ");
                    System.out.println();
                    System.out.println("How many Tamales would you like? ");
                    num = sc.nextInt();
                    total = total + num * TAMALES_PRICE;
                    break;
                case 5:
                    System.out.println("You have ordered a Mexican pizza ");
                    System.out.println();
                    System.out.println("How many Mexican pizzas would you like? ");
                    num = sc.nextInt();
                    total = total + num * MEXICAN_PIZZA_PRICE;
                    break;
                case 6:
                    System.out.println("You have ordered a Taco Salad ");
                    System.out.println();
                    System.out.println("How many Taco Salads would you like? ");
                    num = sc.nextInt();
                    total = total + num * TACO_SALAD_PRICE;
                    break;
                case 7:
                    System.out.println("You have ordered a soft drink ");
                    System.out.println();
                    System.out.println("How many soft drinks would you like? ");
                    num = sc.nextInt();
                    total = total + num * SOFT_DRINK_PRICE;
                    break;
                case 8:
                    System.out.println("You have ordered a Beer ");
                    System.out.println();
                    System.out.println("How many Beers would you like? ");
                    num = sc.nextInt();
                    total = total + num * BEER_PRICE;
                    break;
                case 9:
                    System.exit(1);
                    break;
                default:
                    break;
            }

            System.out.println();

            System.out.print("Would you like another food item? (Y/N) : ");
            String again = sc.next();

            if (again.equalsIgnoreCase("Y")) {
                menu();
            } else if (again.equalsIgnoreCase("N")) {
                createBill();
                System.exit(1);
            } else {
                System.out.println("No such food item");
            }
        }
    }
}
//rjohnson652@ivytech.edu