package Week7;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Array_list {
    public static void main(String[] args) {
        //create arraylist
        ArrayList<Integer> arr=new ArrayList<>();
        //add elements
        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(40);

        //get elements
        System.out.println(arr.get(0));

        //index of an element
        System.out.println(arr.indexOf(20));

        //remove an elemnt from index 
        System.out.println(arr);
        arr.remove(2);
        System.out.println(arr);

        //update
        arr.set(0, 100);
        System.out.println(arr);
        arr.add(1, 800);
        System.out.println(arr);
        
        //size of array
        System.out.println(arr.size());

        //sort
        Collections.sort(arr);

        
        //display
        System.out.println(arr);

        
    }
}
