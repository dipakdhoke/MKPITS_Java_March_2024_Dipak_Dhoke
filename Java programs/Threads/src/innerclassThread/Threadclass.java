package innerclassThread;

public class Threadclass {
    public class thread1 implements Runnable{

        @Override
        public void run() {
            for(int i=0;i<=1000;i+=2){
                System.out.println(i);
            }
        }
    }
    public class thread2 implements Runnable{

        @Override
        public void run() {
            for(int i=1;i<=1000;i+=2){
                System.out.println(i);
            }
        }
    }
    public void Execute() {
        Thread th1=new Thread(new thread1());
        Thread th2 =new Thread(new thread2());
        th1.start();
        th2.start();


    }
}
