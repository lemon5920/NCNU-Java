import java.lang.*;

public class TestPen {
public static Pen p = new Pen();

    public static void triangle(int x, int y, int h) {
        p.flyTo(x, y);
        p.runTo((int)(x + h / Math.sqrt(3) + 0.5), y + h );
        p.runTo((int)(x - h / Math.sqrt(3) + 0.5), y + h );
        p.runTo(x, y);
    }

    public static void main(String[] argv) {
       triangle(400, 50, 512); 
    }
}
