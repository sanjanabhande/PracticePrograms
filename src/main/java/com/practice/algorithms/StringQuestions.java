package com.practice.algorithms;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StringQuestions {

    public static void main(String[] args) {
        duplicateString("alphabeb");
        String a = "silent";
        String b = "listen";
        if (checkIfAnagram(a, b))
            System.out.println("Two Strings '"+a+"' and '"+b+"' are Anagrams");
        else System.out.println("Two Strings '"+a+"' and '"+b+"' are not Anagrams");
        reverseString(a);
        String s = "1234A5";
        if (checkOnlyDigits(s))
            System.out.println("String - "+s+" contains only Digits");
        else System.out.println("String - "+s+" contains Letters");

    }

    // 19. How do you print duplicate characters from a string?
    private static void duplicateString(String value){
        String[] strArray = value.split("");
        List<Character> stringList = new ArrayList<>();
        char[] chars = value.toCharArray();
        for (int i=0; i<chars.length; i++){
            for (int j=i+1; j<chars.length; j++){
                if (chars[j] == chars[i] && (i != j)){
                    System.out.println("Duplicate characters is "+chars[j]);
                    stringList.add(chars[j]);
                    break;
                }
            }
        }
        System.out.println("Duplicate characters are "+stringList);
        // java 8 code
        Set<String> unique = new HashSet<>();
        Set<String> duplicates = Arrays.stream(strArray).filter((a) -> !unique.add(a)).collect(Collectors.toSet());
        System.out.println(unique);
        System.out.println(duplicates);
        // java 8 code
    }

    // 20. How do you check if two strings are anagrams of each other?
    private static boolean checkIfAnagram(String a, String b){
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        boolean isAnagram = true;
        int commonChars = 0;
        if (charsA.length == charsB.length){
            for (int i=0; i<charsA.length; i++){
                for (int j=0; j<charsB.length; j++){
                    if (charsB[j] == charsA[i]){
                        commonChars++;
                        break;
                    }
                }
            }
        }
        if (commonChars != charsA.length){
            isAnagram = false;
        }
        // java 8 code

        // java 8 code
        return isAnagram;
    }

    // 21. How do you print the first non-repeated character from a string?
    private static void getChar(){

    }

    // 22. How can a given string be reversed using recursion?
    private static void reverseString(String s){
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=chars.length-1; i>=0; i--){
            stringBuilder.append(chars[i]);
        }
        System.out.println("Reverse String with using recursion is "+stringBuilder);
        System.out.println("Reverse String without using recursion is "+new StringBuilder(s).reverse());
        // java 8 code
        String[] strArray = s.split("");
        System.out.println(Arrays.toString(IntStream.range(0,strArray.length).mapToObj((a) -> strArray[(strArray.length-1) - a]).toArray()));
        System.out.println(s.chars().mapToObj(i -> Character.toString((char) i)).reduce("", (a, b) -> b + a));
        // java 8 code
    }


    // 23. How do you check if a string contains only digits?
    private static boolean checkOnlyDigits(String s){
        boolean onlyDigits = true;
        for (int i=0; i<s.length(); i++){
            if (Character.isLetter(s.charAt(i))){
                return false;
            }
        }
        return onlyDigits;
        //System.out.println(s.chars().mapToObj(i -> Character.isLetter(i)).toString());
    }

    // 24. How are duplicate characters found in a string?
    // 25. How do you count a number of vowels and consonants in a given string?
    // 26. How do you count the occurrence of a given character in a string?
    // 27. How do you find all permutations of a string?
    // 28. How do you reverse words in a given sentence without using any library method?
    // 29. How do you check if two strings are a rotation of each other?
    // 30. How do you check if a given string is a palindrome?



}
