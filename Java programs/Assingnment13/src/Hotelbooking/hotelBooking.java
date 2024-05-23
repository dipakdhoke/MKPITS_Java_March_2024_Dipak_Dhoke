package Hotelbooking;

public class hotelBooking extends Thread {
   int count=0;
   int amount;
   int totalrent;
   private static int totalEarnings;
   public hotelBooking(int amount){
       this.amount=amount;
   }

    @Override
    public void run() {
        synchronized (this) {
            totalEarnings += amount;
            System.out.println(Thread.currentThread().getName()+" amount is:"+amount);
            System.out.println("Room booked. Total earnings: $" + totalEarnings);
        }

    }
}
