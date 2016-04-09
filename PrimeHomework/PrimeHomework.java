import java.util.Scanner;
import java.lang.Math;
public class PrimeHomework {
    /*
        刪除法
    */
    public static int sieve(int number) {

        boolean[] chosen = new boolean[(int)(number + 1)];
        int sqrtNumber = (int)(Math.sqrt((double)(number)));

        // 2 ~ 根號n，將「還沒被標記的數字」的「倍數」，標記為 true（不為質數）。
        for(int i = 2 ; i <= sqrtNumber ; i++) {
            if(chosen[i] == false) {
                for(int j = i + i ; j <= number ; j += i) {
                    chosen[j] = true;
                }
            }
        }

        // 標記為 false 的，不是其他數的倍數，因此為質數。
        int count = 0;
        for(int i = 2 ; i <= number ; i++) {
            if(chosen[i] == false) {
                count++;
            }
        }
        return count;
    }
    /*
        測試法
    */
    public static int test(int number) {

        int sqrtNumber = (int)(Math.sqrt((double)(number)));
        int count = 0;
 
        for(int i = 2 ; i <= number ; i++) {
            boolean isPrime = true;
            for(int j = 2 ; j < i ; j++) {
                if(i % j == 0) {
                    isPrime = false;
                    break;
                // 驗證範圍由 2 ~ 根號number，減少不必要的運算。
                } else if(j > sqrtNumber) {
                    break;
                }
            }
            if(isPrime) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] argv) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        long startTime, endTime;
/*
        startTime = System.currentTimeMillis();
        System.out.print("測試法 " + test(number) + "個 ");
        endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + "ms");
*/
        startTime = System.currentTimeMillis();
        System.out.print("刪除法 " + sieve(number) + "個 ");
        endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + "ms");
    }
}
