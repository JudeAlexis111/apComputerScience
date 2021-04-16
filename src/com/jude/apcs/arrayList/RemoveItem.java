package com.jude.apcs.arrayList;

import java.util.ArrayList;
import java.util.List;

public class RemoveItem {
    public static void main(String[] args){
        List<String> stringList = new ArrayList<>();

        stringList.add("Jude");
        stringList.add("Felssy");
        stringList.add("Seabass");
        stringList.add("Gaby");

        for(int i = 0; i < stringList.size(); i++){
            if(stringList.get(i).substring(stringList.get(i).length() - 1).equals("e")){
                stringList.remove(i);
            }

            System.out.println(stringList.get(i));
        }

    }
}
