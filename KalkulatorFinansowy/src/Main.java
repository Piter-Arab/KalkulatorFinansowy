import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("VAT Calculator");
        System.out.println("Choose an option:");
        System.out.println("1. Enter price without VAT");
        System.out.println("2. Enter price with VAT");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter price without VAT: ");
            double priceWithoutVAT = scanner.nextDouble();

            System.out.print("Enter VAT rate (%): ");
            double VATRate = scanner.nextDouble();

            // Obliczenie kwoty podatku VAT
            double VATAmount = (priceWithoutVAT * VATRate) / 100;

            // Obliczenie łącznej ceny z podatkiem
            double priceWithVAT = priceWithoutVAT + VATAmount;

            System.out.println("VAT amount is: " + VATAmount);
            System.out.println("Total price with VAT is: " + priceWithVAT);
        } else if (choice == 2) {
            System.out.print("Enter price with VAT: ");
            double priceWithVAT = scanner.nextDouble();

            System.out.print("Enter VAT rate (%): ");
            double VATRate = scanner.nextDouble();

            // Obliczenie kwoty podatku VAT
            double VATAmount = priceWithVAT - (priceWithVAT / (1 + (VATRate / 100)));

            // Obliczenie ceny bez VAT
            double priceWithoutVAT = priceWithVAT - VATAmount;

            System.out.println("VAT amount is: " + VATAmount);
            System.out.println("Price without VAT is: " + priceWithoutVAT);
        } else {
            System.out.println("Invalid option.");
        }
    }
}
