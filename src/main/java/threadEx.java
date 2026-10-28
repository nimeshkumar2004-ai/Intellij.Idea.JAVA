
class thread1 implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+(i*7));
        }
    }
}

public class threadEx {
    public static void main(String[] args) {
        thread1 t1 = new thread1();
        Thread obj=new Thread(t1);
        obj.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("Main Thread " + (i*6));
        }
    }
}

