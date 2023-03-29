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

        Scanner input = new Scanner(System.in);

        // Get birth year
        int year = SafeInput.getRangedInt(input, "Enter the year of your birth", 1950, 2015);

        // Get birth month
        int month = SafeInput.getRangedInt(input, "Enter the month of your birth", 1, 12);

        // Get birthday
        int day = SafeInput.getRangedInt(input,"Enter the day of your birth", 1, 31);

        // Get birth hour
        int hour = SafeInput.getRangedInt(input, "Enter the hour of your birth", 1, 24);

        // Get birth minute
        int minute = SafeInput.getRangedInt(input, "Enter the minute of your birth", 1, 59);



    }


}