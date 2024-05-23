package Thread2;

public class Threadone implements Runnable{

    @Override
    public void run() {

        while (true){
           try {
               System.out.println(Thread.currentThread().getName());
               Thread.sleep(1000);
           }catch (InterruptedException e){
               System.out.println(e);
           }

        }
    }
}
