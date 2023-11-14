import java.util.HashMap;

//It is a condition in which two or more threads compete together to get the certain resource
class Counter {
    private int count;

    public void increment()
    {
        count++;
    }

    public int getCount()
    {
        return count;
    }
}
public class Map {

    public static void main(String[] args) {
        Counter c  = new Counter();

        Thread t1 = new Thread(() -> {
            for (int i=0;i<100000;i++)
            {
                c.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i=0;i<100000;i++)
            {
                c.increment();
            }
        });

        t1.start();
        t2.start();
    }

}
