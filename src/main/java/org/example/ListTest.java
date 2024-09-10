package org.example;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        //crete names object
        List<String> mylist = new ArrayList<String>();
        mylist.add("John");
        mylist.add("simi");
        mylist.add("lola");
        mylist.add("simi");
        mylist.add("kala");

        List<String> duplicate =  new ArrayList<String>();

        for(String names : mylist){
            if(duplicate.contains(names))
                System.out.println(names + " is a duplicate");
            else
                duplicate.add(names);
        }

        System.out.println("The Duplicate list"+duplicate);
    }

}
