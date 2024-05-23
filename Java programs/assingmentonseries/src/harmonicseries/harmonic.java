package harmonicseries;

import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        System.out.println("Harmonic series up to " + n + " terms:");
        generateHarmonicSeries(n);
    }

    public static void generateHarmonicSeries(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
            System.out.print("1/" + i);
            if (i != n) {
                System.out.print(" + ");
            }
        }
        System.out.println(" = " + sum);
    }
}
