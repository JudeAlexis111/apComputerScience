package com.jude.apcs.recursion;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Factorial {
    public static Map<Integer, Double> factorialMap = new HashMap<>();

    public static void main(String args[]){
        /*
        if (!factorialMap.containsKey(5))
            factorialMap.put(5, findFactorial(5));

         */

        System.out.println("Start: " + Instant.now());
        System.out.println("Factorial of n is: " + findFactorial(5000));
        System.out.println("End: " + Instant.now());

        System.out.println("Start: " + Instant.now());
        System.out.println("Factorial of n is: " + findOptimizedFactorial(5000));
        System.out.println("End: " + Instant.now());

    }

    public static double findOptimizedFactorial(int n) {
        if (n<2) return 1;
        if (!factorialMap.containsKey(n))
            factorialMap.put(n, n * findOptimizedFactorial(n-1));
        return factorialMap.get(n);
    }

    public static double findFactorial(int n){
        return (n < 2) ? 1 : n * findFactorial(n-1);
    }
}
