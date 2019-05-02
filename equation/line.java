import java.util.Scanner;
import java.lang.Math;

class line {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("直線方程式");
        System.out.println("輸入兩點座標。 x1, y1, x2, y2");

        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();
        
        float a = (y1 - y2) / (x1 - x2);
        float b = y1 - x1 * a;

        System.out.println("y = " + a + "x + " + b);

        System.out.println("算某點到線段的距離？(y,n)");
        String check1 = sc.next();

        if (check1.equals("y")) {
            System.out.println("輸入點P x, y 值");
            float px = sc.nextFloat();
            float py = sc.nextFloat();

            if (py < y1 || py > y2) {
                System.out.println("input error");
                return;
            }

            float linePx = (py - b) / a;
            float linePy = py;

            System.out.println("點 P 沿 X軸 與線段的交點： (" + linePx + ", " + linePy + ")");
            System.out.println("點 P 與交點的距離： " + Math.abs(linePx - px));
        }

        
    }
}
