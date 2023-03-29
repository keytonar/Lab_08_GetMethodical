import java.util.Scanner;
public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String trash = "";
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getNonZeroLenString(in, "Enter your first name");
        lastName = SafeInput.getNonZeroLenString(in, "Enter your last name");
        System.out.println("\nYour full name is: " + firstName + " " + lastName);

        int favInt = 0;
        double favDouble = 0;
        favInt = SafeInput.getInt(in, "Enter your favorite integer: ");
        favDouble = SafeInput.getDouble(in, "Enter your favorite double: ");

    }


}