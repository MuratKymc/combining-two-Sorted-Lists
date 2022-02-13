package com.company;

import java.util.ArrayList;

public class sorting {

    //this class extra.I used Selection Sort to sort a number from smallest to largest

    
    public static void selectionSort(ArrayList<Integer> inputArray) {

            int smallInt = 0;
            int j = 0;
            int smallIntIndex = 0;

            for (int i = 1; i < inputArray.size(); i++) {

                smallInt = inputArray.get(i - 1);
                smallIntIndex = i - 1;

                for (j = i; j < inputArray.size(); j++) {
                    if (inputArray.get(j) < smallInt) {
                        smallInt = inputArray.get(j);
                        smallIntIndex = j;
                    }
                }
                int sourceIndex = i-1;
                int destIndex = smallIntIndex;

                int temp = inputArray.get(destIndex);
                inputArray.set(destIndex, inputArray.get(sourceIndex));
                inputArray.set(sourceIndex, temp);
            }
        }
    }

