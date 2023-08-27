package org.example;

import java.util.ArrayList;
import java.util.List;
//Given a singly linked list, remove the ��ℎnth node from the end of the list and return its head.
public class NthNode {
    public static void main(String[] args) {
        removeNthNum(1234  , 4);
    }

    static void removeNthNum(int num, int n) {
        List<Character> nums = new ArrayList<>();
        String strVal = String.valueOf(num);
        for(int i = 0; i < strVal.length(); i++) {
            nums.add(strVal.charAt(i));
        }
        nums.remove(nums.size() - n);
        System.out.println(nums);
    }
}
