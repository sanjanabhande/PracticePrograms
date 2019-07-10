package com.practice.hackerrank;

public class AlternatingCharacters {

    public static void main(String[] args){
        System.out.println(alternatingCharacters("AABABB"));
    }
    static int alternatingCharacters(String s) {
        int deletionCount = 0;
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                deletionCount++;
            }
        }
        return deletionCount;
    }

}
