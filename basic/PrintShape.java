/*
 * File Name: PrintShape.java
 * ID: 104213529
 * Author: Jhan Ying
 * Since:2016/02/26
 * Toolkit:vim
 */

import java.util.Scanner;
public class PrintShape {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // print triangle
        for (int i = 1 ; i <= n ; i++){
            printNChar(i, '*');
            System.out.println();
        }
        
        System.out.println("\n");

        // print diamond
        for (int i = 1 ; i <= n ; i ++){
            printNChar(n-i, ' ');
            printNChar(2*i-1, '*');
            System.out.println();
        }

        for (int i = n-1 ; i >= 1 ; i --){
            printNChar(n-i, ' ');
            printNChar(2*i-1, '*');
            System.out.println();
        }
        
    }

    public static void printNChar(int n, char c) {
        for(int i = 1 ; i <= n ; i++){
            System.out.print(c);
        }
    }

}
