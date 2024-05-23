package primenothread;

public class prime implements Runnable {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    @Override
    public void run() {

        System.out.println("Prime numbers from 1 to 1000:");
        for (int i = 2; i <= 1000; i++) {
            if (prime.isPrime(i)) {
                System.out.print(i+"\n");

            }
        }
    }
}