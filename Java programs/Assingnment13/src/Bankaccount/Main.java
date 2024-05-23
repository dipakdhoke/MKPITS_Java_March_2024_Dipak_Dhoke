package Bankaccount;

public class Main {
    public static void main(String[] args) {
        Bankaccount bankAccount=new Bankaccount();
        new Thread(){
            public void run(){
                bankAccount.withdraw(15000);}
        }.start();
        new Thread(){
            public void run(){
                bankAccount.deposit(10000);}
        }.start();


    }
    }
