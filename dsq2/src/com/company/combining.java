package com.company;

import java.util.ArrayList;

public class combining {

    public static void combineArrays(ArrayList arr1, ArrayList arr2,ArrayList arr3) {

        arr3.addAll(arr1);
        arr3.addAll(arr2);
        removeDuplicates(arr3);
        sorting.selectionSort(arr3);

    }

    public static <T> void removeDuplicates(ArrayList<T> list){
        ArrayList<T> newList = new ArrayList<T>();

        for (T element : list) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        list.clear();
        list.addAll(newList);
    }

}


