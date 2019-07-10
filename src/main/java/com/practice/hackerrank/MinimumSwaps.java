package com.practice.hackerrank;

public class MinimumSwaps {

    public static void main(String[] args) {
        int minimumSwaps = minimumSwaps(new int[]{2,3,4,1,5});
        System.out.println(minimumSwaps);
        int minimumSwaps1 = minimumSwaps1(new int[]{2,3,4,1,5});
        System.out.println(minimumSwaps1);
    }

    // Complete the minimumSwaps function below.
    static int minimumSwaps1(int[] arr) {
        int i = 0;
        while (arr[i] == arr[arr[i]-1]){
            i++;
            if (i>arr.length-1){
                return countSwaps;
            }
        }
        countSwaps = swap(arr,i);
        minimumSwaps1(arr);
        return countSwaps;
    }

    static int countSwaps = 0;

    static int swap(int[] arr, int i){
        int index = arr[i]-1;
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
        countSwaps++;
        return countSwaps;
    }

    //
    static void swap(int[] array,int left, int right){
        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
    }

    static int minimumSwaps2(int[] arr) {
        int rightPointer = arr.length -1;

        int count = 0;
        int minimumSwaps = 0;

        while(count < arr.length){
            int arrValue = count+1;

            if(arr[count] == arrValue){
                count++;
                continue;
            }

            while(arr[rightPointer] != arrValue){
                rightPointer --;
            }

            if(rightPointer != count){
                swap(arr, count, rightPointer);
                minimumSwaps++;
            }

            rightPointer = arr.length -1;
            count++;
        }
        return minimumSwaps;
    }
    //

    //
    static int minimumSwaps(int[] arr) {
        int first = 0, last = arr.length - 1;
        int swaps = 0;
        while (first < last) {
            while (arr[first] == first + 1 && first < last)
                first++;
            if (first < last) {
                int temp = arr[arr[first] - 1];
                arr[arr[first] - 1] = arr[first];
                arr[first] = temp;
                swaps++;
            }
        }
        return swaps;
    }
    //

}
