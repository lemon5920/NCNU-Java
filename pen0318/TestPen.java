public class TestPen {
    public static void main(String[] argv) {
        Pen p = new Pen();
        p.flyTo(50, 50);
        p.runTo(150, 50);
        p.runTo(150, 150);
        p.runTo(50, 150);
        p.runTo(50, 50);
        
    }
}
