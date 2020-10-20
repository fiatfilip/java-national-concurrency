package ro.siit.randomizer;

import java.util.Random;

public class Randomizer implements Runnable{
    private int number;
    @Override
    public void run() {
        Random rdzer = new Random(); //
        number = rdzer.nextInt(10) + 1;
        System.out.println(Thread.currentThread() + " generated " + number);
    }

    public int getNumber() {
        return number;
    }
}
