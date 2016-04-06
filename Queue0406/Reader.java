public class Reader extends Thread {
    private Queue q;
    private String name;
    public Reader(Queue q, String n) {
        this.q = q;
        name = n;
    }
    public void run() {
        for(;;) {
            System.out.println(name + " : " + q.delete());
        }
    }
}
