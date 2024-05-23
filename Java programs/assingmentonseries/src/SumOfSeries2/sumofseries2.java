package SumOfSeries2;

import java.util.Scanner;

public class sumofseries2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        double sum = sumOfSeries(N);
        System.out.println("Sum of the series is: " + sum);
    }

    public static double sumOfSeries(int N) {
        double sum = 0;
        double factorial = 1;

        for (int i = 1; i <= N; i++) {
            factorial *= i;
            sum += i / factorial;
        }
        return sum;
    }
}
