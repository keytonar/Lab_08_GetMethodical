import java.util.Scanner;

public class PrettyHeader {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a message to display: ");
        String msg = input.nextLine();
        SafeInput.prettyHeader(msg);
    }
}
