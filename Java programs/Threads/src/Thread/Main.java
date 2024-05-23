package Thread;

public class Main {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());
        Thread th =new Thread(new Mythread());
        th.setName("Shahrukh");
        System.out.println(Thread.activeCount());

        System.out.println(th.currentThread().getName());
        th.start();


    }


}
