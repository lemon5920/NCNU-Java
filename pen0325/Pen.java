import java.awt.*;
import javax.swing.*;
public class Pen {
    private LocalPaint pc;
    private int cx, cy;
    JFrame f;
    public static void main(String[] argv) {
        System.out.println("This is a program for drawing lines.請用物件導向來使用本程式。");
    }
    public Pen() {
        f = new JFrame("程式設計下範例:");
        f.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE );
        f.getContentPane().add(new JScrollPane(pc = new LocalPaint()));
        f.setSize(850,650);
        f.setVisible(true);
    }
    /**
     * Set cursor to (x,y)
     */
    public void flyTo(int x, int y) {
        cx = x;
        cy = y;
    }
    /**
     *Draw a line from cursor to (x,y), then set cursor to (x,y)
     */
    public void runTo(int x, int y) {
        Graphics g = pc.getGraphics();
        g.drawLine(cx, cy, x ,y);
        cx = x;
        cy = y;
        pc.repaint();
    }
    class LocalPaint extends JComponent {
        private Image tmp;
        public void paint(Graphics g) {
            g.drawImage(tmp, 0, 0, null);
        }
        public Dimension getPreferredSize() {
            Dimension fSize=f.getSize();
            return new Dimension(fSize.width-50, fSize.height-50);
        }
        public Graphics getGraphics() {
            if (tmp == null){
                Dimension fSize=f.getSize();
                tmp = createImage(fSize.width-50, fSize.height-50);
            }
            return tmp.getGraphics();
        }
    }
}
