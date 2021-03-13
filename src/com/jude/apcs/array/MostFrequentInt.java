package com.jude.apcs.array;

public class MostFrequentInt {
    public static void main (String[] args){
        int[] numArray = {5,2,4,7,7,2,4,8,5,7};
        int repeatedNum = 0;
        int instances = 0;

        for(int num: numArray){
            int NewInstances = 0;

            for(int num2: numArray){
                if(num == num2){
                    NewInstances++;
                }
            }

            if(NewInstances > instances){
                instances = NewInstances;
                repeatedNum = num;
            }
        }

        System.out.println(repeatedNum);
    }
}
