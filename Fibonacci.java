
package com.mycompany.fibonacci;


public class Fibonacci {
    public static int fibonacciRecursivo(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Serie Fibonacci (recursivo) para " + n + " términos:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursivo(i) + " ");
        }
    }
}
