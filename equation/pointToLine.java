import java.util.Scanner;

class pointToLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("輸入線段L a, b 值：");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        System.out.println("輸入點P x, y 值");
        float x = sc.nextFloat();
        float y = sc.nextFloat();

        System.out.println("點 P 沿 Ｘ軸，與線段 L 相交點");
    }
}
