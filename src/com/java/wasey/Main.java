package com.java.wasey;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //ArrayList vs Vector

        //ArrayList maintains order of insertion and allows identical values
        //not synchronized
        //size is increased by 50% when list is full
        //ArrayList can only use Iterator for traversing

        List<Integer> list=new ArrayList<>();
        list.add(122);
        list.add(122);
        list.add(111);
        list.add(10);
        list.add(100);

        //ArrayList traversal using Iterator
        System.out.println("Contents of list: ");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //if you want to synchronize it you can do so by:
        List<Integer> syncedlist = Collections.synchronizedList(list);



        //Vector also maintains order of insertion and allows identical values
        //Vector is synchronized by default
        //size is incremented by 100% (doubled the size) when vector is full
        Vector<Integer>vector=new Vector<>();
        vector.add(5);
        vector.add(10);
        vector.add(88);
        vector.add(5);
        vector.add(0);

        //traversing elements using Enumeration     (Iterator can be used as shown in ArrayList
        System.out.println("\nContents of vector:");
        Enumeration e = vector.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }



    }
}
