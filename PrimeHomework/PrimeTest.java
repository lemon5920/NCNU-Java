import java.lang.Math;
import java.util.Scanner;
/*
Prime Number
測試法
*/
class PrimeTest {
    public static void main(String[] argv) {

        Scanner sc = new Scanner(System.in);
        double number = sc.nextDouble();
        int sqrtNumber = (int)(Math.sqrt(number));
        String printPrime = "";
 
        for(int i = 2 ; i <= (int)(number) ; i++) {
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
                printPrime = printPrime + i + " ";
            }
        }
        System.out.println(printPrime);
    }
}
