package com.practice.hackerrank;

import java.util.Arrays;

public class RotateLeftArray {

    public static void main(String[] args) {
        int[] rotatedArray = rotLeft(new int[]{1,2,3,4,5}, 4);
        System.out.println(Arrays.toString(rotatedArray));
    }

    // Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {
        int[] rotatedArray = new int[a.length];
        for (int i=0; i<a.length; i++){
            int index = i-d;
            if (index<0){
                index = index+a.length;
            }
            rotatedArray[index] = a[i];
        }
        return rotatedArray;
    }

}
