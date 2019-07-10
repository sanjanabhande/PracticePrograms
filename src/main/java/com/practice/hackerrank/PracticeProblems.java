package com.practice.hackerrank;

import java.util.Arrays;

public class PracticeProblems {

    public static void main(String[] args){
        sortArray();
        printHyphensInSingleRow();
        print2DArray();
    }

    private static void sortArray(){
        int[] strArray = new int[] {708,123,546,22};
        int sum=0;
        boolean contains = false;
        int containsInt = 123;
        int indexOfElement = 0;
        for (int i=0; i<strArray.length; i++){
            sum = sum + strArray[i];
            if (containsInt == strArray[i]){
                contains = true;
                indexOfElement = i;
            }
        }
        System.out.println("Index of element = "+indexOfElement);
        System.out.println("Sum of aaray = "+sum);
        System.out.println("Not sorted array = "+Arrays.toString(strArray));
        Arrays.sort(strArray);
        System.out.println("Sorted array = "+Arrays.toString(strArray));
        System.out.println("Contains = "+contains);
    }

    private static void printHyphensInSingleRow(){
        StringBuilder str = new StringBuilder("-");
        for (int i=0; i<9; i++){
            str.append(" -");
        }
        printHyphensInMultipleRow(str.toString());
    }

    private static void printHyphensInMultipleRow(String str){
        for (int i=0; i<9; i++){
            System.out.println(str);
        }
    }

    private static void print2DArray(){
        int[][] a = new int[10][10];
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.printf(a[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
