// class Bank{
//    float balance=10000.0f;
//    void withdraw(float amount){
//        if(balance > amount) {
//            balance = balance - amount;
//            System.out.println("current balance is "+balance);
//        }
//        else {
//            System.out.println("insufficient funds");
//        }
//    }
//}
//     class MyThread implements Runnable {
//    Bank b;
//    float amount;
//    MyThread(Bank b,float amount){
//        this.b=b;
//        this.amount=amount;
//
//    }
//    public void run() {
//        b.withdraw(amount);
//    }
// }
// public class bankThreadEx{
//    public static void main(String[] args){
//        Bank b=new Bank();
//        MyThread t1=new MyThread(b,7000);
//        MyThread t2=new MyThread(b,7000);
//        Thread obj=new Thread(t1);
//        Thread obj2=new Thread(t2);
//        obj.start();
//        obj2.start();
//    }
// }


class Bank {
    float balance = 10000.0f;

    synchronized void withdraw(float amount) {
        String name = Thread.currentThread().getName();

        System.out.println(name + " is trying to withdraw " + amount);

        if (balance >= amount) {
            balance = balance - amount;
            System.out.println(name + " successful withdrawal");
            System.out.println("Current balance is " + balance);
        } else {
            System.out.println(name + ": insufficient funds");
        }
    }
}

class MyThread implements Runnable {
    Bank b;
    float amount;

    MyThread(Bank b, float amount) {
        this.b = b;
        this.amount = amount;
    }

    public void run() {
        b.withdraw(amount);
    }
}

public class bankThreadEx {
    public static void main(String[] args) {
        Bank b = new Bank();

        MyThread t1 = new MyThread(b, 7000);
        MyThread t2 = new MyThread(b, 7000);

        Thread obj = new Thread(t1, "t1");
        Thread obj2 = new Thread(t2, "t2");

        obj.start();
        obj2.start();
    }
}