package com.jude.apcs.array;

public class AllEven {
    public static void main(String[] args) {
        int numbers[] = {2,4,2,6,8};
        boolean allEven = true;

        for(int n: numbers){
            if(n % 2 != 0){
                allEven = false;
            }
        }

        System.out.println("It is " + allEven + " that all of the numbers are even");
    }
}
