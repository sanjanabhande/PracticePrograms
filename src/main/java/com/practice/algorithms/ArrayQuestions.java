package com.practice.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayQuestions {

    public static void main(String[] args) {
        getMissingNum(new Integer[]{1,2,3,5,6,7,8,9}, 9);
        getDuplicateNum(new Integer[]{1,2,3,4,5,5,6,3});
        getLargestSmallestNumber(new Integer[]{10,1,2,8,3,4,5,6,3});
        sumOfIntegers(10, new Integer[]{1,2,3,4,5,5,6,3});
        removeDuplicates(new Integer[]{1,2,3,4,5,5,6,3});
        getSortedIntegerArray(new Integer[]{10,1,2,8,3,4,5,6,3});
        reverseArray(new Integer[]{7,2,3,4,5,5,6,3});
    }

    // 1. find missing number in a given integer array
    private static void getMissingNum(Integer[] intArray, int n){
        for (int i=0; i<intArray.length; i++){
            if ((i+1) != intArray[i]){
                System.out.println("Missing number is "+(i+1));
                break;
            }
        }
        // java 8 code
        int actualSum = (n*(n+1))/2;
        int arrSum = Arrays.stream(intArray).reduce((a,b) -> a+b).get();
        int missingNum = actualSum - arrSum;
        System.out.println(missingNum);
        // java 8 code
    }
    // 1. find missing number in a given integer array

    // 5. find duplicate numbers in an array if it contains multiple duplicates
    // 2. find duplicate number on a given integer array
    private static void getDuplicateNum(Integer[] intArray){
        List<Integer> integerList = new ArrayList<>();
        for (int i=0; i<intArray.length; i++){
            for (int j=i+1; j<intArray.length; j++){
                if (intArray[j] == intArray[i] && i!=j){
                    System.out.println("Duplicate number is "+intArray[j]);
                    integerList.add(intArray[j]);
                }
            }
        }
        System.out.println("Duplicate numbers in list are "+integerList.toString());
        // java 8 code
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = Arrays.stream(intArray).filter((a) -> !unique.add(a)).collect(Collectors.toSet());
        System.out.println(duplicates);
        // java 8 code
    }
    // 2. find duplicate number on a given integer array
    // 5. find duplicate numbers in an array if it contains multiple duplicates

    // 3. find the largest and smallest number in an unsorted integer array
    private static void getLargestSmallestNumber(Integer[] intArray){
        Arrays.sort(intArray);
        System.out.println("Largest number is "+intArray[intArray.length-1]+" and Smallest number is "+intArray[0]);
        // java 8 code
        System.out.println("Largest number is "+Arrays.stream(intArray).sorted(Comparator.reverseOrder()).findFirst().get());
        System.out.println("Smallest number is "+Arrays.stream(intArray).sorted().findFirst().get());
        // java 8 code
    }
    // 3. find the largest and smallest number in an unsorted integer array

    // 4. find all pairs of an integer array whose sum is equal to a given number
    private static void sumOfIntegers(Integer number, Integer[] intArray){
        for (int i = 0; i < intArray.length; i++) {
            int first = intArray[i];
            for (int j = i + 1; j < intArray.length; j++) {
                int second = intArray[j];
                if ((first + second) == number) {
                    System.out.printf("(%d, %d) %n", first, second);
                }
            }
        }
    }
    // 4. find all pairs of an integer array whose sum is equal to a given number

    // 10. How are duplicates removed from an array without using any library?
    // 8. How do you remove duplicates from an array in place?
    // 6. How are duplicates removed from a given array in Java
    private static void removeDuplicates(Integer[] intArray){
        Set<Integer> intSetList = new HashSet<>();
        for (int i=0; i<intArray.length; i++){
            intSetList.add(intArray[i]);
        }
        System.out.println("Duplicate removed list is "+intSetList);
        // java 8 code
        System.out.println(Arrays.stream(intArray).collect(Collectors.toSet()));
        // java 8 code
    }
    // 6. How are duplicates removed from a given array in Java
    // 8. How do you remove duplicates from an array in place?
    // 10. How are duplicates removed from an array without using any library?

    // 7. How is an integer array sorted in place using the quicksort algorithm
    private static void getSortedIntegerArray(Integer[] intArray){
        Arrays.sort(intArray);
        System.out.println("Sorted integer array is "+Arrays.toString(intArray));
        // java 8 code
        System.out.println(Arrays.toString(Arrays.stream(intArray).sorted().toArray()));
        // java 8 code
    }
    // 7. How is an integer array sorted in place using the quicksort algorithm

    // 9. How do you reverse an array in place in Java?
    private static void reverseArray(Integer[] intArray){
        int j = intArray.length;
        Integer[] reverseArray = new Integer[j];
        for (int i=0; i<intArray.length; i++){
            reverseArray[j-1] = intArray[i];
            j--;
        }
        System.out.println("Reverse array is "+Arrays.asList(reverseArray).toString());
        // java 8 code
        Object[] revArr = IntStream.range(0,intArray.length).mapToObj((a) -> intArray[(intArray.length-1) - a]).toArray();
        System.out.println(Arrays.toString(revArr));
        // java 8 code
    }
    // 9. How do you reverse an array in place in Java?

}
