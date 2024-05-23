package primenothread;

public class notprime implements Runnable {
    public static boolean notPrime(int n) {
        if (n <= 1) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void run() {
        System.out.println("not Prime numbers from 1 to 1000:");
        for (int i = 2; i <= 1000; i++) {
            if (notprime.notPrime(i)) {
                System.out.print(i+"\n");

            }
        }
    }
}
