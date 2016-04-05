/*
質數，刪去法
*/
import java.util.Scanner;
public class PrimeSieve {
    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        boolean[] chosen = new boolean[(int)(n+1)];
        // 2 ~ 根號n，將「還沒被標記的數字」的「倍數」，標記為 true（不為質數）。
        for(int i = 2 ; i <= (int)(Math.sqrt(n)) ; i++) {
            if(chosen[i] == false) {
                for(int j = i + i ; j <= (int)(n) ; j += i) {
                    chosen[j] = true;
                }
            }
        }

        // 標記為 false 的，不是其他數的倍數，因此為質數。
        String PrintPrime = "";
        for(int i = 2 ; i <= (int)(n) ; i++) {
            if(chosen[i] == false) {
                PrintPrime = PrintPrime + i + " ";
            }
        }
        System.out.println(PrintPrime);
    }
}
