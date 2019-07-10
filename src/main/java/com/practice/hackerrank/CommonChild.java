package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CommonChild {

    public static void main(String[] args){
        System.out.println(commonChild("HARRY","SALLY"));
        System.out.println(commonChild("SHINCHAN","NOHARAAA"));
        System.out.println(commonChild("AA","BB"));
        System.out.println(commonChild("ABCDEFABC","FBDAMNABC"));
    }

    static int commonChild(String s1, String s2) {
        char[] chars1 = s1.toCharArray();
        char[] chars2 = s2.toCharArray();
        int longestChildStringCount = 0;
        List<Character> characterList = new ArrayList<>();
        List<Character> commonCharList = new ArrayList<>();
        for (int i=0; i<chars2.length; i++){
            characterList.add(chars2[i]);
        }
        for (int i=0; i<chars1.length; i++){
            Iterator<Character> characterIterator = characterList.iterator();
            while (characterIterator.hasNext()){
                if (characterIterator.next() == chars1[i]){
                    longestChildStringCount++;
                    commonCharList.add(chars1[i]);
                    characterIterator.remove();
                    break;
                }
            }
        }
        System.out.println(commonCharList);
        return longestChildStringCount;
    }
}
