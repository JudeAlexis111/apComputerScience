package com.jude.apcs.arrayList;

import java.util.ArrayList;
import java.util.List;

public class SmallestLargest {
    public static void main(String[] args){
        List<Integer> numList = new ArrayList<>();
        for(int x = 0; x < 10; x++){
            int randNumber = (int)(Math.random() * (100 + 100) -100);
            numList.add(randNumber);
        }

        removeIndex(3, numList);

        System.out.println(numList);
        System.out.println(LargestInt(numList));
        System.out.println(SmallestInt(numList));
    }

    public static int LargestInt(List<Integer> numList){
        int largestNumber = numList.get(0);
        for(int x: numList){
            if(largestNumber < x){
                largestNumber = x;
            }
        }

        return largestNumber;
    }

    public static int SmallestInt(List<Integer> numList){
        int smallestNumber = numList.get(0);
        for(int x: numList){
            if(smallestNumber > x){
                smallestNumber = x;
            }
        }

        return smallestNumber;
    }

    public static void removeIndex(int arrayIndex, List<Integer> numList){
        numList.remove(arrayIndex);
    }
}

