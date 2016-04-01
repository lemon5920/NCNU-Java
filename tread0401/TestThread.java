/*
Tread 請小心使用
*/
import java.util.*;
public class TestThread extends Thread implements Runnable{

    private String name;

    public TestThread(String name) {
        this.name = name;
    }

    public void run(){
        for(;;) {
            System.out.println("Hello " + name);
        }
    }

    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        Thread t1 = new TestThread("老魚");
        Thread t2 = new Thread(new TestThread("悅悅"));
        // after a Tread was started, it executes run();
        t1.start();
        t2.start();
    }
}
