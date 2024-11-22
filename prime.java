import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Close the scanner
        scanner.close();

        // Check if the number is prime
        boolean isPrime = true;

        // Check divisibility from 2 to num-1
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false; // Not prime
                break;
            }
        }

        // Output the result
        if (isPrime && num > 1) {
            System.out.println(num);
        } else {
            System.out.println(num );
        }
    }
}
