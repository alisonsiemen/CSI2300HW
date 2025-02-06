import java.util.Scanner;

public class CSI2300HW4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput = "";
        String systemOutput = "";
        int i;

        System.out.println("Enter a string to reverse: ");
        userInput = scanner.nextLine();

        for (i = userInput.length()-1; i >= 0; --i) {
            systemOutput += userInput.charAt(i);
        }

        System.out.println(systemOutput);

        scanner.close();
    }
}