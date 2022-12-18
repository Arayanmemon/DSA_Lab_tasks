package Lab3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {   
        Lab3 l = new Lab3();
        int arr[] = {3,5,6,3,9,3,7,36,7};

        long before = System.nanoTime();
        int b = l.LinearSearch1D(arr,36);
        long after = System.nanoTime();
        long total = after-before;
        System.out.println("Time taken to found element in linear search is "+total+" nanoseconds");



        before = System.nanoTime();
        b = l.BinarySearch1D(arr,36);
        after = System.nanoTime();
        total = after-before;
        System.out.println("Time taken to found element in binary search is  "+total+" nanoseconds");




        int arr2d[][] = {{1,2,3,4,5,6,7,8},{9,10,11,12,13,14,15,16}};
        int c[] = l.BinarySearch2D(arr2d, 10);
        System.out.println("Element found at row "+c[0]+" and col "+c[1]);
        
    }
}
