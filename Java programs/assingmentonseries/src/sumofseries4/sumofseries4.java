package sumofseries4;

import java.util.Scanner;

public class sumofseries4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int N = scanner.nextInt();

        double sum = sumOfSeries(N);
        System.out.println("Sum of the series is: " + sum);
    }

    public static double sumOfSeries(int N) {
        double sum = 0;

        for (int i = 1; i <= N; i++) {
            sum += 1.0 / (i * i);
        }
        return sum;
    }
}

