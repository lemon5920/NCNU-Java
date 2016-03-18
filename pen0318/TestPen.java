import java.lang.*;

public class TestPen {

public static Pen p = new Pen();

    public static void triangle(int x, int y, int h) {
        p.flyTo(x, y);
        p.runTo((int)(x + h / Math.sqrt(3) + 0.5), y + h );
        p.runTo((int)(x - h / Math.sqrt(3) + 0.5), y + h );
        p.runTo(x, y);
    }

    public static void fractalTriangle(int x, int y, int h) {
        if(h <= 1) {
            p.flyTo(x, y);
            p.runTo(x, y);
            return;
        }
        fractalTriangle(x, y, h/2);
        fractalTriangle((int)(x + h / Math.sqrt(3) / 2 + 0.5), y+h/2, h/2);
        fractalTriangle((int)(x - h / Math.sqrt(3) / 2 + 0.5), y+h/2, h/2);

    }

    public static void main(String[] argv) {
       fractalTriangle(400, 50, 512); 
    }
}
