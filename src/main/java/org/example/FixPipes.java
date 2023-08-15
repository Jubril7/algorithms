package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FixPipes {
    public static void main(String[] args) {
        fixPipes(new int[]{1,2,3,7,8,9});
    }

    static void fixPipes(int[] arr) {
        int firstNum = arr[0];
        int lastNum = arr[arr.length - 1];
        List<Integer> newNums = new ArrayList<>();

        for(int i = 0; i < lastNum; i++) {
            newNums.add(firstNum++);
        }
        int[] result = new int[newNums.size()];

        for(int i = 0; i < newNums.size(); i++) {
            result[i] = newNums.get(i);
        }
        System.out.println(Arrays.toString(result));
    }
}
