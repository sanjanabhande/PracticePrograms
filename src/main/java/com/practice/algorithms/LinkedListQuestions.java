package com.practice.algorithms;

import java.util.LinkedList;

public class LinkedListQuestions {

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("beta 123");
        linkedList.add("alpha 546");
        linkedList.add("gema 12");
        reverseLinkedList(linkedList);
    }

    // 11. How do you find the middle element of a singly linked list in one pass?
    // 12. How do you check if a given linked list contains a cycle? How do you find the starting node of the cycle?

    // 13. How do you reverse a linked list?
    private static void reverseLinkedList(LinkedList<String> linkedList){
        LinkedList<String> reverseLinkedList = new LinkedList<>();
        for (int i=linkedList.size()-1; i>=0; i--){
            String s = linkedList.get(i);
            reverseLinkedList.add(s);
        }
        System.out.println("Reverse Linked list is "+reverseLinkedList);
    }

    // 14. How do you reverse a singly linked list without recursion?
    // 15. How are duplicate nodes removed in an unsorted linked list?
    // 16. How do you find the length of a singly linked list?
    // 17. How do you find the third node from the end in a singly linked list?
    // 18. How do you find the sum of two linked lists using Stack?

}
