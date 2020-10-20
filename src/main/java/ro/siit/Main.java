package ro.siit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
//        Counter counter11 = new Counter(2, 100);
//        System.out.println("Before" + Thread.currentThread());
//        counter11.start();

        Thread counter2 = new Thread(new CounterRunnable());
        System.out.println("Before"+ Thread.currentThread());
        counter2.start();
        System.out.println("In between"+ Thread.currentThread());
        counter2.join();
        System.out.println("After"+ Thread.currentThread());
    }
}
