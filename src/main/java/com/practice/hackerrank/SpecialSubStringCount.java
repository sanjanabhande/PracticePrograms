package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class SpecialSubStringCount {

    public static void main(String[] args){
        //System.out.println("asasd = "+substrCount(5,"asasd"));
        //System.out.println("abcbaba = "+substrCount(7,"abcb"));
        System.out.println("aaaa = "+check(4,"aaaa"));
        System.out.println("abcbaba = "+check(7,"abcb"));
        //System.out.println(appendSubString(2, "abcd".toCharArray()));
    }

    static long substrCount1(int n, String s) {
        long subStrCount = n;
        char[] chars = s.toCharArray();
        List<String> subStrings = new ArrayList<>();
        for (int i=1; i<=chars.length; i++){
            for (int j=0; j<chars.length; j+=i){
                subStrings.add(appendSubString(i,chars));
            }
            System.out.println(subStrings);
            System.out.println("one loop done ");
        }
        return subStrCount;
    }

    private static String appendSubString(int runLoopTill, char[] chars){
        List<String> subStrings = new ArrayList<>();
        for (int i=0; i<chars.length; i+=runLoopTill){
            StringBuilder stringBuilder = new StringBuilder();
            for (int j=0; j<runLoopTill; j++){
                stringBuilder.append(chars[i]);
            }
            subStrings.add(stringBuilder.toString());
        }
        System.out.println("list = "+subStrings);
        return null;

    }

    /*static long substrCount(int n, String s) {
        long subStrCount = n;
        char[] chars = s.toCharArray();
        for (int i=0; i<chars.length; i++){
            if ((i >= 0) && (i < chars.length-1)) {
                if (chars[i] == chars[i + 1]) {
                    subStrCount++;
                }
            }
            if ((i >= 0) && (i < chars.length-2)){
                if ((chars[i] != chars[i+1]) && (chars[i+1] != chars[i+2]) && (chars[i] == chars[i+2])){
                    subStrCount++;
                }
            }
        }
        return subStrCount;
    }*/

    static long substrCountAA(int n, String s) {
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            int innerCounter = 1;

            int counterDown = 0;
            int counterUp = 1;
            while (i - innerCounter >= 0 && i + innerCounter < s.length()
                    && s.charAt(i - innerCounter) == s.charAt(i - 1) && s.charAt(i + innerCounter) == s.charAt(i - 1)) {
                count++;
                innerCounter++;
            }

            while (i - counterDown >= 0 && i + counterUp < s.length() && s.charAt(i - counterDown) == s.charAt(i)
                    && s.charAt(i + counterUp) == s.charAt(i)) {
                count++;
                counterDown++;
                counterUp++;
            }
        }

        return count + s.length();
    }

    public static long substrCount(int length, String s) {
        long counter = 0;
        for (int i = 0; i < length; i++) {
            // if the current symbol is in the middle of palindrome, e.g. aba
            int offset = 1;
            while (i - offset >= 0 && i + offset < length && s.charAt(i - offset) == s.charAt(i - 1)
                    && s.charAt(i + offset) == s.charAt(i - 1)) {
                counter++;
                offset++;
            }
            // if this is repeatable characters aa
            int repeats = 0;
            while (i + 1 < length && s.charAt(i) == s.charAt(i + 1)) {
                repeats++;
                i++;
            }
            counter += repeats * (repeats + 1) / 2;
        }
        return counter + length;
    }

        private static long check(int n, String input){
            long count = substring(input)
                    .stream()
                    .filter(SpecialSubStringCount::check)
                    .count();
            return count;
        }

        private static List<String> substring(String input){
            int subStringLength = input.length();
            int difference = 1;
            List<String> subStringList = new ArrayList<>();
            for(int i=0; i<=subStringLength; i++){
                for(int j=0; j< subStringLength;j++){
                    int start = j;
                    int end = start+difference;
                    if(end<=subStringLength) {
                        subStringList.add(input.substring(start, end));
                    }
                }
                difference++;
            }
            System.out.println(subStringList);
            return subStringList;
        }

        private static boolean check(String input){
            return isPalindrome(input) && isAllCharsExceptMiddleSame(input);
        }

        private static boolean isPalindrome(String input){
            return input.equalsIgnoreCase(new StringBuilder(input).reverse().toString());
        }

        private static boolean isAllCharsExceptMiddleSame(String input){
            Character charToCheck = input.charAt(0);
            char[] inputChars = input.toCharArray();
            for(int i=0;i<inputChars.length;i++){
                if(charToCheck.equals(inputChars[i]) || (i == inputChars.length/2)){
                    continue;
                }else{
                    return false;
                }
            }
            return true;
        }


}
