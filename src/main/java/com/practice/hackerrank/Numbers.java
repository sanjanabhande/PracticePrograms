package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public static void main(String[] args) {
        getSmallestNDigitNumber(125);
        System.out.println(fetchPronicNums(2, 100000));
        getPrimeFactor(100);
    }

    private static void getSmallestNDigitNumber(int number){
        int lengthOfN = String.valueOf(number).length();
        System.out.println("Smallest number of N digits is "+Math.pow(10,lengthOfN-1));
    }

    private static int fetchPronicNums(long start, long end){
        int countPronicNums = 0;
        long i = 1;
        long j = i+1;
        while (i < end){
            long iMultiplyj = i*j;
            if ((iMultiplyj >= start) && (iMultiplyj <= end)){
                countPronicNums++;
            }
            if (iMultiplyj > end){
                break;
            }
            i++; j++;
        }
        return countPronicNums;
    }

    private static void getPrimeFactor(int number){
        int factor = 2;
        int factorialNum = number;
        List<Integer> primeFactors = new ArrayList<>();
        while (factorialNum > 1){
            int modValue = factorialNum % factor;
            if (modValue == 0){
                primeFactors.add(factor);
                factorialNum = factorialNum/factor;
            }else {
                factor++;
            }
        }
        System.out.println("Prime factors are "+primeFactors);
    }

}
