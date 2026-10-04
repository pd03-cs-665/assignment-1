package edu.bu.met.cs665;

import edu.bu.met.cs665.beverage.Beverage;
import edu.bu.met.cs665.beverage.coffee.Americano;
import edu.bu.met.cs665.beverage.coffee.Coffee;
import edu.bu.met.cs665.beverage.coffee.Espresso;
import edu.bu.met.cs665.beverage.coffee.Latte;
import edu.bu.met.cs665.beverage.coffee.Macchiato;
import edu.bu.met.cs665.beverage.tea.BlackTea;
import edu.bu.met.cs665.beverage.tea.GreenTea;
import edu.bu.met.cs665.beverage.tea.Tea;
import edu.bu.met.cs665.beverage.tea.YellowTea;
import java.util.Scanner;

public class Main {

    static final String ANSI_BOLD = "\u001B[1m";
    static final String ANSI_RESET = "\u001B[0m";

    static Scanner scanner = new Scanner(System.in);

    /**
     * Prints tea menu options and initialize beverage appropriately.
     */
    public static void teaMenu() {
        while (true) {
            System.out.println();
            System.out.println("+----- Tea Menu -----+");
            System.out.println("| " + ANSI_BOLD + "1 " + ANSI_RESET + "Black Tea        |");
            System.out.println("| " + ANSI_BOLD + "2 " + ANSI_RESET + "Green Tea        |");
            System.out.println("| " + ANSI_BOLD + "3 " + ANSI_RESET + "Yellow Tea       |");
            System.out.println("+--------------------+");
            System.out.println(ANSI_BOLD + "q " + ANSI_RESET + "Go back");
            System.out.println();

            System.out.print("Your selection: ");
            String userSelection = scanner.nextLine().trim();
            System.out.println();

            switch (userSelection) {
                case "1":
                    BlackTea blackTea = new BlackTea();
                    customizeBeverage(blackTea);
                    return;
                case "2":
                    GreenTea greenTea = new GreenTea();
                    customizeBeverage(greenTea);
                    return;
                case "3":
                    YellowTea yellowTea = new YellowTea();
                    customizeBeverage(yellowTea);
                    return;
                case "q":
                    return;

                default:
                    System.out.println("Invalid selection, please try again!");
            }
        }
    }

    /**
     * Prints coffee menu options and initializes beverage appropriately.
     */
    public static void coffeeMenu() {
        while (true) {
            System.out.println();
            System.out.println("+--- Coffee Menu ---+");
            System.out.println("| " + ANSI_BOLD + "1 " + ANSI_RESET + "Americano       |");
            System.out.println("| " + ANSI_BOLD + "2 " + ANSI_RESET + "Espresso        |");
            System.out.println("| " + ANSI_BOLD + "3 " + ANSI_RESET + "Latte           |");
            System.out.println("| " + ANSI_BOLD + "4 " + ANSI_RESET + "Macchiato       |");
            System.out.println("+-------------------+");
            System.out.println(ANSI_BOLD + "q " + ANSI_RESET + "Go back");
            System.out.println();

            System.out.print("Your selection: ");
            String userSelection = scanner.nextLine().trim();
            System.out.println();

            switch (userSelection) {
                case "1":
                    Americano americano = new Americano();
                    customizeBeverage(americano);
                    return;
                case "2":
                    Espresso espresso = new Espresso();
                    customizeBeverage(espresso);
                    return;
                case "3":
                    Latte latte = new Latte();
                    customizeBeverage(latte);
                    return;
                case "4":
                    Macchiato macchiato = new Macchiato();
                    customizeBeverage(macchiato);
                    return;

                case "q":
                    return;

                default:
                    System.out.println("Invalid selection, please try again!");
            }
        }
    }

    /**
     * Prompts for beverage customization options and print receipt total.
     * @param beverage Any Beverage instance.
     */
    public static void customizeBeverage(Beverage beverage) {
        System.out.println(ANSI_BOLD + "Customize your " + beverage.getDescription() + ANSI_RESET);

        System.out.print("How much milk would you like? (0-3): ");
        int milkLevel = getLevel();
        System.out.print("How much sugar would you like? (0-3): ");
        int sugarLevel = getLevel();

        beverage.setMilkLevel(milkLevel);
        beverage.setSugarLevel(sugarLevel);

        System.out.println();
        System.out.println(ANSI_BOLD + "--- Your Receipt ---" + ANSI_RESET);
        System.out.println("1 " + beverage.getDescription());
        System.out.println("    " + beverage.getMilkLevel() + "x Milk");
        System.out.println("    " + beverage.getSugarLevel() + "x Sugar");
        System.out.printf("Subtotal     $%.2f%n", beverage.getCost());
        System.out.println(ANSI_BOLD + "--------------------" + ANSI_RESET);
        System.out.println();

        if (beverage instanceof Coffee) {
            ((Coffee) beverage).brew();
        }

        if (beverage instanceof Tea) {
            ((Tea) beverage).steep();
        }

        System.out.println();
        System.out.println("Enjoy your " + beverage.getDescription() + "!");

        if (!orderAnotherDrink()) {
            System.out.println("Thanks for visiting Laya's Beverage Machine!");
            scanner.close();
            System.exit(0);
        }
    }

    /**
     * Queries and checks user input for customization level.
     * @return User requested customization level.
     */
    public static int getLevel() {
        while (true) {
            String input = scanner.nextLine().trim();
            try {
                int level = Integer.parseInt(input);
                if (level >= 0 && level <= 3) {
                    return level;
                }
                System.out.println("Please enter a number between 0 and 3.");
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number between 0 and 3.");
            }
        }
    }

    /**
     * Function to prompt for re-order.
     * @return Whether user would like to make another order.
     */
    public static boolean orderAnotherDrink() {
        while (true) {
            System.out.print("Would you like to order another drink? (y/n): ");

            String response = scanner.nextLine().trim().toLowerCase();

            if (response.equals("y")) {
                return true;
            }

            if (response.equals("n")) {
                return false;
            }

            System.out.println("Please enter y or n.");
        }
    }

    /**
     * Main entry point of program to start simple command lineinterface for
     * the beverage vending machine.
     */
    public static void main(String[] args) {

        while (true) {
            System.out.println();
            System.out.println(
                    ANSI_BOLD
                            + "============================================"
                            + ANSI_RESET);
            System.out.println(
                    ANSI_BOLD
                            + " Welcome to Laya's Beverage Vending Machine!"
                            + ANSI_RESET);
            System.out.println(
                    ANSI_BOLD
                            + "============================================"
                            + ANSI_RESET);

            System.out.println("Select an option:");
            System.out.println(ANSI_BOLD + "1 " + ANSI_RESET + "Coffee");
            System.out.println(ANSI_BOLD + "2 " + ANSI_RESET + "Tea");
            System.out.println(ANSI_BOLD + "q " + ANSI_RESET + "Exit");

            System.out.print("Your selection: ");
            String userSelection = scanner.nextLine().trim();
            System.out.println();

            switch (userSelection) {
                case "1":
                    System.out.println("You have selected " + ANSI_BOLD + "COFFEE" + ANSI_RESET);
                    coffeeMenu();
                    break;

                case "2":
                    System.out.println("You have selected " + ANSI_BOLD + "TEA" + ANSI_RESET);
                    teaMenu();
                    break;

                case "q":
                    System.out.println("Thanks for visiting!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid selection, please try again!");
            }
        }
    }
}
