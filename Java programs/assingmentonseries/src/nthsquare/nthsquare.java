package nthsquare;

import java.util.Scanner;

public class nthsquare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = sumOfSeries(n);
        System.out.println("Sum of the series is: " + sum);
    }

    public static int sumOfSeries(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }
}
