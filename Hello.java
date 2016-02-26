/*
 * File Name: Hello.java
 * ID: 104213529
 * Author: Jhan Ying
 * Since:2016/02/26
 * Toolkit:vim
 */

import java.util.Scanner;
public class Hello {

    public static void main(String args[]) {
        
        // Hello World
        System.out.println("Hello World!\n");

        // call another function
        System.out.println("power(3,5)=" + power(3,5) + "\n");

        // print the input number
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Your input is " + n + "\n");
    }

    public static int power(int x, int n) {
        int result = 1;
        for(int i = 1 ; i <= n ; i++) {
            result = result * x;
        }
        return result;
    }

}
