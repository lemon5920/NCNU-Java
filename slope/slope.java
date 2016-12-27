import java.util.Scanner;

public class slope {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: x1, y1");
        float x1 = sc.nextFloat();
        float y1 = sc.nextFloat();
        System.out.println("Input: x2, y2");
        float x2 = sc.nextFloat();
        float y2 = sc.nextFloat();

        float slope = (y2 - y1) / (x2 - x1);
        System.out.println("斜率：" + slope);
    } 
}
