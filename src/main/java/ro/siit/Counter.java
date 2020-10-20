package ro.siit;

public class Counter extends Thread{
    private int step;
    private int limit;

    public Counter(int step, int limit){
        this.step = step;
        this.limit = limit;
    }
    @Override
    public void run() {
        for(int i = 0; i< limit; i = i + step){
            System.out.println("" + i + Thread.currentThread());
        }
    }
}
