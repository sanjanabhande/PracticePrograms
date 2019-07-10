package com.practice.algorithms;

import java.util.Arrays;

public class Mergesort {

    public static void main(String[] args) {
        int[] array = new int[]{38,27,43,3,9,82,10};
        System.out.println(Arrays.toString(array));
        int[] sortedArray = mergesort(array, new int[array.length],0, (array.length) -1);
        System.out.println(Arrays.toString(sortedArray));
    }

    private static int[] mergesort(int[] arr, int[] temp, int leftStart, int rightEnd){
        if (leftStart >= rightEnd){
            return arr;
        }
        int mid = (leftStart+rightEnd) / 2;
        mergesort(arr,temp,leftStart,mid);
        mergesort(arr,temp,mid+1,rightEnd);
        combineArrays(arr,temp,leftStart,rightEnd);
        return arr;
    }

    private static void combineArrays(int[] arr, int[] temp, int leftStart, int rightEnd){
        int leftEnd = (leftStart+rightEnd) / 2;
        int rightStart = leftEnd+1;
        int size = (rightEnd-leftStart) + 1;
        int left = leftStart;
        int right = rightStart;
        int index = leftStart;

        while ((left <= leftEnd) && right <= rightEnd){
            if (arr[left] <= arr[right]){
                temp[index] = arr[left];
                left++;
            } else {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        System.arraycopy(arr,left,temp,index,(leftEnd-left)+1);
        System.arraycopy(arr,right,temp,index,(rightEnd-right)+1);
        System.arraycopy(temp,leftStart,arr,leftStart,size);
    }
}
