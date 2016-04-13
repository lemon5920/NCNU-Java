import java.util.Scanner;
class Primes {
    public static boolean isPrime(int n){
        for(int i = 2; i * i <= n; i++)
            if(n % i == 0)
                return false;
        return true;
    }
    public static int primes(int n) {
        int counter = 0;
        for(int i = 2; i <= n; i++)
            if(isPrime(i))
                counter++;
        return counter;
    }
    public static int p2(long n) {
        // the default value of boolean array is false
        boolean[] deleted = new boolean[(int)(n/2+1)];
        int counter = 1;
        for(long i = 3; i <= n; i+=2) {
            if(!deleted[(int)(i/2)]) { // find a primes
                counter++;
                for(long j = 3 * i; j <= n; j += 2*i) {
                    deleted[(int)(j/2)] = true;
                }
            }
        }
        return counter;
    }
    public static void main(String[] argv) {
        Scanner input = new Scanner(System.in);
        long n = input.nextLong();
        System.out.println("There are " + p2(n) + " primes <= " + n);
    }
}
