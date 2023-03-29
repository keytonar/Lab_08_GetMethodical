import java.util.Scanner;
/**
 *
 * @param pipe a Scanner opened to read from System.in
 * @param prompt prompt for the user
 * @return a String response that is not zero length
 */


public class SafeInput
{
    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" + prompt + ":"); // show prompt add space
            retString = pipe.nextLine();
        } while (retString.length() == 0);

        return retString;
    }
    /**
     * Prompts the user to input an integer value and validates the input.
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return an integer value entered by the user
     */
    public static int getInt(Scanner pipe, String prompt) {
        int value = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(prompt);
            if (pipe.hasNextInt()) {
                value = pipe.nextInt();
                validInput = true;
            } else {
                String trash = pipe.next();
                System.out.println("Invalid input. Please enter an integer value.");
            }
            pipe.nextLine(); // clear the newline character from the input stream
        }
        return value;
    }

}