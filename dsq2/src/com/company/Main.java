package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(1);
        arr1.add(13);
        arr1.add(8);
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr2.add(16);
        arr2.add(1);
        arr2.add(13);
        arr2.add(8);
        ArrayList<Integer> arr3 = new ArrayList<>();

        System.out.println("Array 1 : " + arr1);
        System.out.println("Array 2 : " + arr2);
        combining.combineArrays(arr1,arr2,arr3);

        System.out.println("Array 3(combined) : " + arr3);

    }

}
