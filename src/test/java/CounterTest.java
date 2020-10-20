import org.junit.Test;
import ro.siit.Counter;

public class CounterTest {
    @Test
    public void testCounter(){
        Counter counter2_100 = new Counter(2, 100);
        Counter counter5_200 = new Counter(5, 200000);
        Counter counter3_140 = new Counter(3, 140);
        counter2_100.start();
        counter3_140.start();

        counter5_200.setDaemon(true);
        counter5_200.start();
        // counter5_200.setDaemon(true);
    }
}
