package primenothread;

public class Main {
    public static void main(String[] args) {
        Thread th1 = new Thread(new prime());
        Thread th2 = new Thread(new notprime());
        th1.start();
        th2.start();
    }
}

