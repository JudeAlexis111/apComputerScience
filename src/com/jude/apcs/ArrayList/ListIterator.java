package com.jude.apcs.ArrayList;

import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListIterator {
    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();
        List<String> strings = Arrays.asList("Felssy","Gaby");

        stringList.add("Jude");
        stringList.add("Felssy");
        stringList.add("Sebe");
        stringList.add("Gaby");

        for(int x = 0; x < stringList.size(); x++){
            System.out.println(stringList.get(x));
       }

        for(String x: strings){
            System.out.println(x);
        }
    }
}
