import java.util.Scanner;

public class TenDollarStore {

    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) {
        double input = 0;
        boolean validInput = false;
        do {
            System.out.print(prompt + " [" + low + " - " + high + "]: ");
            if (pipe.hasNextDouble()) {
                input = pipe.nextDouble();
                pipe.nextLine(); // clear the newline character
                if (input >= low && input <= high) {
                    validInput = true;
                } else {
                    System.out.println("Input must be within range [" + low + " - " + high + "]");
                }
            } else {
                pipe.nextLine(); // clear the input
                System.out.println("Invalid input, please enter a valid decimal number.");
            }
        } while (!validInput);
        return input;
    }

    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        String input;
        do {
            System.out.print(prompt + " [Y/N]: ");
            input = pipe.nextLine().toUpperCase();
        } while (!input.equals("Y") && !input.equals("N"));
        return input.equals("Y");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems = true;
        while (moreItems) {
            double itemPrice = getRangedDouble(scanner, "Enter the price of the item", 0.5, 10.0);
            totalCost += itemPrice;
            moreItems = getYNConfirm(scanner, "Do you have more items to add?");
        }
        System.out.printf("The total cost is $%.2f%n", totalCost);
    }
}
