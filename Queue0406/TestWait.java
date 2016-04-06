import java.util.Scanner;
public class TestWait {
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        Queue q = new Queue();
        (new Reader(q, "R1")).start();
        (new Reader(q, "R2")).start();
        (new Reader(q, "R3")).start();
        for(;;) {
            q.add(input.nextInt());
        }
    }
}
