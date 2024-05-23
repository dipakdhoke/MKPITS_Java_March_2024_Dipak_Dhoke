package Thread2;

public class Main {
    public static void main(String[] args) {
        Thread thread1= new Thread(new Threadone());
        Thread thread2=new Thread(new Threadtwo());
        thread1.setName("salman");
        thread2.setName("amir");
        thread1.start();
        thread2.start();
    }
}
