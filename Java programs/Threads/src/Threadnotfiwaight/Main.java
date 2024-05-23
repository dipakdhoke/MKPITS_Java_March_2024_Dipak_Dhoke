package Threadnotfiwaight;

public class Main {
    public static void main(String[] args) {

        Yourthread usThread = new Yourthread();
        synchronized (usThread) {
            usThread.start();
            try {
                usThread.wait(); // Wait until the calculation is done
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(usThread.sum + " hii");

        }
    }
}
