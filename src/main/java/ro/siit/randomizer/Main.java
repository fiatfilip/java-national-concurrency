package ro.siit.randomizer;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Randomizer[] randomizers = new Randomizer[5];
        Thread[] randomizersThreads = new Thread[randomizers.length];
        for(int i = 0; i < randomizers.length; i++){
            randomizers[i] = new Randomizer();
            randomizersThreads[i] = new Thread(randomizers[i]);
            randomizersThreads[i].start();
        }

        for(Thread thread: randomizersThreads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // randomizersThreads[2].start();

        int suma = Arrays.stream(randomizers)
                .parallel().map(r -> r.getNumber())
                .reduce(0, (sum, number) -> sum + number);
        System.out.println(suma);
    }
}
