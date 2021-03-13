package com.jude.apcs.array;

public class FindAboveAverage {
    public static void main(String[] args) {
        int numbers[] = {1,3,5,2,7,6,5};
        double average = 0;

        for(int i : numbers){
            average = average + i;
        }

        average = average / numbers.length;

        for(int i: numbers){
            if(i > average){
                System.out.println(i);
            }
        }

    }
}
