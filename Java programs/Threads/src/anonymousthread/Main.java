package anonymousthread;

public class Main {
    public static void main(String[] args) {
        Runnable ren=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<=1000;i+=2){
                    System.out.println(i);
                }
            }
        };
        Runnable run2=new Runnable() {
            @Override
            public void run() {
                for(int i=1;i<=1000;i+=2){
                    System.out.println(i);
                }
            }
        };
        Thread thread = new Thread(ren);
        Thread thread2 =new Thread(run2);
        thread.start();
        thread2.start();
    }
}
