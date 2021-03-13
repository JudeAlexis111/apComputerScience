package com.jude.apcs.array;

import java.util.Arrays;

public class FindSum {
    public static void main (String[] args){
        int[] numArray = {5,3,2,4,7,9};
        int sum = 0;

        for(int num: numArray){
            sum = sum + num;
        }

        System.out.println(sum);
        sum = 0;

        for(int i = 0; i < numArray.length; i++){
            sum = sum + numArray[i];
        }

        System.out.println(sum);
        int x = 0;
        sum = 0;

        while(numArray.length > x){
            sum = sum + numArray[x];
            x++;
        }

        System.out.println(sum);
        System.out.println(Arrays.toString(numArray));
    }
}
