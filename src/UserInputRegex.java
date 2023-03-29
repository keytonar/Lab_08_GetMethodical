import java.util.Scanner;

public class UserInputRegex {

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String input = "";
        do {
            System.out.print(prompt + ": ");
            while (!pipe.hasNextLine()) {
                // Do nothing
            }
            input = pipe.nextLine().trim();
            pipe.reset(); // Clear any delimiter from the pipe
        } while (!input.matches(regEx));
        return input;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ssn = getRegExString(scanner, "Enter your SSN (###-##-####)", "^\\d{3}-\\d{2}-\\d{4}$");
        String mNumber = getRegExString(scanner, "Enter your UC Student M number (M#####)", "^(M|m)\\d{5}$");
        String menuChoice = getRegExString(scanner, "Enter a menu choice (O, S, V, Q)", "^[OoSsVvQq]$");
        System.out.printf("SSN: %s%nM Number: %s%nMenu Choice: %s%n", ssn, mNumber, menuChoice);
    }
}
