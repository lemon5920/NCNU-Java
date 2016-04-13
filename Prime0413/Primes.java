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
    public static long p2(long n) {
        // the default value of boolean array is false
        long maxLen = 2000000000L;
        boolean[][] deleted = new boolean[(int)((n-1)/2/maxLen+1)][];
        long index = 0;
        for (; (index+1)*2*maxLen <= n; index++) {
            deleted[(int)index] = new boolean[(int)maxLen];
        }
        if (n-index*2*maxLen > 0)
            deleted[(int)(index)] = new boolean[(int)(n-index*2*maxLen)];
        long counter = 1;
        for (long i = 3; i <= n; i+=2) {
            if (!deleted[(int)(i/2/maxLen)][(int)(i/2%maxLen)]) { // find a primes
                counter++;
                for (long j = 3 * i; j <= n; j += 2*i)
                    deleted[(int)(j/2/maxLen)][(int)(j/2%maxLen)] = true;
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
