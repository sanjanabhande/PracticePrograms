package com.practice.algorithms;

import java.util.Arrays;

public class Quicksort {

    public static void main(String[] args) {
        int[] array = new int[]{38,27,43,3,9,82,10};
        System.out.println(Arrays.toString(array));
        int[] sortedArray = quicksort(array, 0, (array.length) -1);
        System.out.println(Arrays.toString(sortedArray));

    }

    private static int[] quicksort(int[] arr, int left, int right){
        if (left >= right){
            return arr;
        }
        int pivot = arr[(left + right) / 2];
        int index = partition(arr, left, right, pivot);
        quicksort(arr,left,index-1);
        quicksort(arr,index,right);
        return arr;
    }

    private static int partition(int[] arr, int left, int right, int pivot){
        while (left <= right){
            while (arr[left] < pivot){
                left++;
            }
            while (arr[right] > pivot){
                right--;
            }
            if (left <= right){
                swap(arr,left,right);
                left++;
                right--;
            }
        }
        return left;
    }

    private static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
