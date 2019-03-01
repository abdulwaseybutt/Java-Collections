package com.java.wasey;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //ArrayList vs Vector
        System.out.println("ArrayList vs Vector");

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

        //traversing elements using Enumeration     (Iterator can be used as shown in ArrayList)
        System.out.println("\nContents of vector:");
        Enumeration e = vector.elements();
        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }






        //HashSet vs SortedSet

        System.out.println("\nHashSet vs SortedSet");
        //HashSet is a solid class extending the AbstractSet class which implements the Set interface
        //has unique values and order of insertion is not preserved
        //allows only 1 null value

        Set<Integer>hashset=new HashSet<>();
        hashset.add(1);
        hashset.add(1);
        hashset.add(null);
        hashset.add(null);
        hashset.add(20);
        hashset.add(33);

        System.out.println("contents of hashset: "+ hashset);


        //SortedSet is an interface that implements Set interface
        //can be implemented using TreeSet
        //does not allow nulls
        //order of insertion is not preserved
        //values are sorted

        SortedSet<Integer>sortedSet=new TreeSet<>();
        sortedSet.add(22);
        sortedSet.add(99);
        sortedSet.add(22);
        //sortedSet.add(null);      //throws a Null pointer exception

        System.out.println("Contents of SortedSet: "+sortedSet);








        //TreeSet vs HashSet
        System.out.println("\nTreeSet vs HashSet");
        //TreeSet implements the Navigable Interface which extends the SortedSet interface
        //exactly like SortedSet(no duplicated, no null, order is sorted)
        //has extra helper methods inherited from NavigableSet

        NavigableSet<Integer>treeSet=new TreeSet<>();
        treeSet.add(33);
        treeSet.add(44);
        treeSet.add(55);
        treeSet.add(33);

        // Get a reverse view of the navigable set
        NavigableSet<Integer> reverseNs = treeSet.descendingSet();

        // Print the normal and reverse views
        System.out.println("Normal order: " + treeSet);
        System.out.println("Reverse order: " + reverseNs);

        System.out.println("lower(3): " + treeSet.lower(3));
        System.out.println("floor(3): " + treeSet.floor(3));
        System.out.println("higher(3): " + treeSet.higher(3));
        System.out.println("ceiling(3): " + treeSet.ceiling(3));

        System.out.println("Contents of Navigable Set:  " +treeSet);













        //Array vs List
        System.out.println("\nArray vs List");
        //An array is basic functionality provided by Java
        //array members are accessed using []
        //no dynamic growth by itself
        //fixed size
        //Array can contain both primitive data types as well as objects of a class
        int[] arr=new int[]{1,2,3,4,5};
        System.out.println("Contents of array: ");
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }


        //List is part of collection framework in Java
        //List has a set of methods to access elements and modify them
        //List only supports object entries, not the primitive data types
        List<Integer> arrList = new ArrayList<>();

        // Add elements to ArrayList
        arrList.add(1);
        arrList.add(33);
        arrList.add(2);
        arrList.add(4);

        arrList.remove(arrList.get(0));
        arrList.remove(arrList.get(2));

        // Access elements of ArrayList
        System.out.println("\nContents of List: ");
        for (int i=0;i<arrList.size();i++){
            System.out.println(arrList.get(i));
        }









        //List vs Set
        System.out.println("\nList vs Set");
        //List is an ordered sequence of elements
        //allows duplicates
        //The user can access elements by their integer index
        //implementation using LinkedList or ArrayList (already shown above)
        List<Integer> arrlist = new ArrayList<>();

        // Add elements to ArrayList
        arrlist.add(1);
        arrlist.add(1);
        arrlist.add(1);
        System.out.println("Contents of List: ");
        for (int i=0;i<arrlist.size();i++){
            System.out.println(arrlist.get(i));
        }


        //Set is a distinct list of elements which is unordered
        //Can not be accessed by index
        //different implementation classes have slightly different rules
        //HashSet (unordered),  LinkedHashSet (ordered),  TreeSet (ordered)

        Set<Integer> hash_Set = new HashSet<>();
        hash_Set.add(1);
        hash_Set.add(1);        //duplicate
        hash_Set.add(5555);
        hash_Set.add(4333);
        hash_Set.add(5045);
        hash_Set.add(54);



        System.out.println("Contents of HashSet without duplicates: "+hash_Set);

        // Set demonstration using TreeSet
        Set<Integer> tree_Set = new TreeSet<>(hash_Set);
        System.out.println("Contents of sorted TreeSet: "+tree_Set+"\n");









        //NavigableSet vs NavigableMap
        System.out.println("\nNavigableSet vs NavigableMap");

        //Navigable set is an interface that extends SortedSet interface
        //no duplicates allowed in set
        //order according to solid class you use
        //HashSet (unordered),  LinkedHashSet (ordered),  TreeSet (ordered)
        //utility methods are given in this interface to help modify data
        NavigableSet<Integer> ns = new TreeSet<>();
        ns.add(0);
        ns.add(1);
        ns.add(2);
        ns.add(3);
        ns.add(4);
        ns.add(5);
        ns.add(6);

        // Get a reverse view of the navigable set
        NavigableSet<Integer> reverNs = ns.descendingSet();

        // Print the normal and reverse views
        System.out.println("Normal order: " + ns);
        System.out.println("Reverse order: " + reverseNs);


        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollLast(): " + ns.pollLast());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("Navigable Set:  " + ns);

        System.out.println("pollFirst(): " + ns.pollFirst());
        System.out.println("pollLast(): " + ns.pollLast());




        //NavigableMap is an interface exactly like NavigableSet except that it extends the SortedMap interface
        //Key-value pairs are stored
        //duplicate keys are not allowed
        //if duplicate element is entered, the previous value on that "key" is replaced with new value
        //utility methods are given in this interface to help modify data

        NavigableMap<String, Integer> nm =
                new TreeMap<String, Integer>();
        nm.put("C", 888);
        nm.put("Y", 999);
        nm.put("A", 444);
        nm.put("T", 555);
        nm.put("B", 666);
        nm.put("A", 555);

        System.out.printf("\nDescending Set  : %s%n",
                nm.descendingKeySet());
        System.out.printf("Floor Entry  : %s%n",
                nm.floorEntry("L"));
        System.out.printf("First Entry  : %s%n",
                nm.firstEntry());
        System.out.printf("Last Key : %s%n",
                nm.lastKey());
        System.out.printf("First Key : %s%n",
                nm.firstKey());
        System.out.printf("Original Map : %s%n", nm);
        System.out.printf("Reverse Map : %s%n",
                nm.descendingMap());
    }

}
