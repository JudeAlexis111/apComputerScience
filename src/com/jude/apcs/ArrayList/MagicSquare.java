package com.jude.apcs.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class MagicSquare {
    public static void main(String args[]){
        int n = 4;
        List<Integer> numArray = new ArrayList<>();

        for(int x = 1; x < ((n * n) + 1); x++){
            numArray.add(x);
        }

        System.out.println(numArray.size());
    }
}
