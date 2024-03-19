package pl.pp;
import java.util.Scanner;
public class myFourthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter lower and upper integer limits: ");
            int lowerLimit = scanner.nextInt();
            int upperLimit = scanner.nextInt();

            if (upperLimit <= lowerLimit) {
                System.out.println("Upper limit should be greater than the lower limit.");
                break;
            }

            int sumOfSquares = calculateSumOfSquares(lowerLimit, upperLimit);
            System.out.printf("The sum of the squares from %d to %d is %d%n", lowerLimit * lowerLimit, upperLimit * upperLimit, sumOfSquares);
        }

        System.out.println("Done");
        scanner.close();
    }

    public static int calculateSumOfSquares(int lower, int upper) {
        int total = 0;
        for (int i = lower; i <= upper; i++) {
            total += i * i;
        }
        return total;
    }
}