import java.util.Scanner;

public class CSI2300HW3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i;
        double numKm;
        double numMile;
        double numMeter;
        double numFt;
        double numGram;
        double numOunce;
        double numKg;
        double numLb;
        String unitType;
        String userInput = "0";

        System.out.println("Enter one of the following units:");
        System.out.println("kilometers | meters | grams | kilograms");
        System.out.println("and an amount with a space between.");
        System.out.println("Type exit to end.");

        while (userInput != "exit") {
            userInput = scanner.next();

            if (userInput == "exit") {
                continue;
            }

            for (i =0; i < userInput.length(); ++i) {
                unitType += Character.toLowerCase(userInput.charAt(i));
            }
            
            if (unitType == "kilometers") {
                numKm = scanner.nextDouble();
                numMile = numKm * 0.62;
                System.out.println(numKm + " kilometers = " + numMile + " miles");
            } else if (unitType == "meters") {
                numMeter = scanner.nextDouble();
                numFt = numMeter * 3.28;
                System.out.println(numMeter + " meters = " + numFt + " feet");
            } else if (unitType == "kilograms") {
                numKg = scanner.nextDouble();
                numLb = numKg * 2.20;
                System.out.println(numKg + " kilograms = " + numLb + " pounds");
            } else if (unitType == "grams") {
                numGram = scanner.nextDouble();
                numOunce = numGram * 0.04;
                System.out.println(numGram + " grams = " + numOunce + " ounces");
            } else {
                System.out.println("Not a valid input.");
            }
        }

        scanner.close();
    }
    
}