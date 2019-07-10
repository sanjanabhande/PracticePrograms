package com.practice.hackerrank;

public class CountAppleOranges {

    public static void main(String[] args) {
        countApplesAndOranges(7,11,5,15,new int[]{-2,2,1},new int[]{5,-6});
    }

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int countApple = 0;
        int countOrange = 0;
        for (int i=0; i<apples.length; i++){
            int appleAt = a + apples[i];
            if (appleAt >= s && appleAt <= t){
                countApple++;
            }
        }
        for (int i=0; i<oranges.length; i++){
            int orangeAt = b + oranges[i];
            if (orangeAt >= s && orangeAt <= t){
                countOrange++;
            }
        }
        System.out.println(countApple);
        System.out.println(countOrange);
    }

}
