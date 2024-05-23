package Hotelbooking;

public class Main {
    public static void main(String[] args) {
        int amount;
        System.out.println("Hotel booking");
        for(int i=0;i<10;i++){
            amount=(int)(Math.random()*100+100);
            hotelBooking hotel =new hotelBooking(amount);
            hotel.start();
        }
    }
}
