package com.practice.hackerrank;

import java.util.Arrays;

public class PermutationEquation {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(permutationEquation(new int[]{2,3,1})));
        System.out.println(Arrays.toString(permutationEquation(new int[]{4,3,5,1,2})));
    }

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int[] y = new int[p.length];
        int[] px = new int[p.length];
        int count = 0;
        for (int i=0; i<=p.length; i++){
            for (int j=0; j<p.length; j++){
                if(i == p[j]){
                    px[count] = j+1;
                    count++;
                }
            }
        }
        for (int i=0; i<px.length; i++){
            int value = px[i];
            y[i] = px[value-1];
        }
        return y;
    }
}
