import java.lang.*;

public class TestPen {

    public static Pen p = new Pen();

    public static void fractalLine(int x, int y, double h, double r) {

        if(h <= 1){
            p.flyTo(x, y);
            p.runTo(x, y);
            try {
                Thread.currentThread().sleep(10);
            } catch(Exception err){
            }
            return;
        }
        
        // 畫出4個小factalLine
        // 第一段，起點(x, y)，長度h/3，角度r
        fractalLine(x, y, h/3.0, r);

        // 第二段,起點(x,y)+h/3+(cos(r),sin(r)),長度h/3,角度r+60
        int nextX = x + (int)(h / 3.0 * Math.cos(Math.toRadians(r)));
        int nextY = y + (int)(h / 3.0 * Math.sin(Math.toRadians(r)));
        fractalLine(nextX, nextY, h/3.0, r-60);

        // 第三段,起點...,長度h/3,角度r-60
        nextX = nextX + (int)(h / 3.0 * Math.cos(Math.toRadians(r-60)));
        nextY = nextY + (int)(h / 3.0 * Math.sin(Math.toRadians(r-60)));
        fractalLine(nextX, nextY, h/3.0, r+60);

        // 第4段,起點...,長度h/3,角度r
        nextX = x + (int)(h / 3.0 * 2 * Math.cos(Math.toRadians(r)));
        nextY = y + (int)(h / 3.0 * 2 * Math.sin(Math.toRadians(r)));
        fractalLine(nextX, nextY, h/3.0, r);
    }

    public static void polygon(int x, int y, int h, int n) {
        // 中心(x, y)半徑為h的正n邊形
        double 等分角 = 360.0/n;
        double 邊長 = 2 * h * Math.sin(Math.toRadians(等分角/2));

        // 先到第一個頂點
        //p.flyTo((int)(x + h * Math.cos(Math.toRadians(-90))), (int)(x + h * Math.sin(Math.toRadians(-90))));

        // 算出n個頂點的座標
        for(int i = 0 ; i < n ; i++) {
            int topX = (int)(x + h * Math.cos(Math.toRadians(i * 等分角 - 90)));
            int topY = (int)(y + h * Math.sin(Math.toRadians(i * 等分角 - 90)));
            fractalLine(topX, topY, 邊長, (i+0.5) * 等分角);
        }

    }

    public static void main(String[] argv) {
        // fractalLine(50, 300, 270, 0);
        polygon(300, 300, 200, 3);
    }
}
