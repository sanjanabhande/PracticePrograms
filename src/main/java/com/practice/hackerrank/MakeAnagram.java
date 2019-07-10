package com.practice.hackerrank;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MakeAnagram {

    public static void main(String[] args) {
        System.out.println(makeAnagram("fcrxzwscanmligyxyvym","jxwtrhvujlmrpdoqbisbwhmgpmeoke"));
        // 20-10 + 30-10 // 10+20=30
        System.out.println(makeAnagram("abcdefghijk","abcdlmnopqrstuvwxyz"));
        // 11-4 + 19-4 // 7+15=22
    }

    static int makeAnagram(final String a, final String b) {
        final int deletionCount;
        int commonCharsCount = 0;
        final char[] charA = a.toCharArray();
        final char[] charB = b.toCharArray();
        List<Character> characterList = new ArrayList<>();
        for (int i=0; i<charB.length; i++){
            characterList.add(charB[i]);
        }
        for (int i=0; i<charA.length; i++){
            Iterator<Character> characterIterator = characterList.iterator();
            while (characterIterator.hasNext()){
                if (characterIterator.next() == charA[i]){
                    commonCharsCount++;
                    characterIterator.remove();
                    break;
                }
            }
        }
        deletionCount = ((charA.length) - commonCharsCount) + ((charB.length) - commonCharsCount);
        return deletionCount;
    }

}
