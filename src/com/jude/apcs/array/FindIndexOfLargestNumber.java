package com.jude.apcs.array;

public class FindIndexOfLargestNumber {
    public static void main(String[] args) {

        int numbers[] = {1,3,5,2,7,6,5};
        int largestIndex = 0;

        for(int i = 1; i < numbers.length; i++){
            if(numbers[i] > numbers[largestIndex]){
                largestIndex = i;
            }
        }

        System.out.println("The largest number is at: " + largestIndex);



    }
}
