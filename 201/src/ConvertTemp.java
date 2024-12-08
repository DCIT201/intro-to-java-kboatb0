import java.util.Scanner;

public class ConvertTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display menu
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        if (choice == 1) {
            // C to F
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.printf("The temperature in Fahrenheit is: %.2f°F%n", fahrenheit);
        } else if (choice == 2) {
            // F to C
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.printf("The temperature in Celsius is: %.2f°C%n", celsius);
        } else {
            System.out.println("Invalid choice. Please run the program again and choose either 1 or 2.");
        }

        scanner.close();
    }
}
