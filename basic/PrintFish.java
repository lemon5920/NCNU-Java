/*
 * File Name: PrintFish.java
 * ID: 104213529
 * Author: Jhan Ying
 * Since:2016/02/26
 * Toolkit:vim
 */

import java.util.Scanner;
public class PrintFish {
    public static void main(String args[]) {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for(int i = 1;i <= n; i++){
            printNChar( (n-i) * 3, ' ');
            printNChar( 6 * i - 3, '*');
            printNChar( (n-i) * 3 + (n-i), ' ');
            printNChar( i - 1, '*');
            System.out.println();
        }

        for(int i = n-1 ;i >= 1; i--){
            printNChar( (n-i) * 3, ' ');
            printNChar( 6 * i - 3, '*');
            printNChar( (n-i) * 3 + (n-i), ' ');
            printNChar( i - 1, '*');
            System.out.println();
        }

    }

    public static void printNChar(int n, char c) {
    for(int i = 1 ; i <= n ; i++){
            System.out.print(c);
        }
    }

}
