package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateZero {
    public static void main(String[] args) {
        duplicateZero(new int[]{1,0,2,4,6,0,7});
//        [1,0,0,2,4,6,0]
    }

    static void duplicateZero(int[] arr) {
        List<Integer> newArr = new ArrayList<>();
        int[] result = new int[arr.length];
        for (int num : arr) {
            if (num == 0) {
                newArr.add(num);
                newArr.add(num);
            } else {
                newArr.add(num);
            }
        }
        int diff = newArr.size() - arr.length;
        for(int i = 0; i < newArr.size() - diff; i++) {
            result[i] = newArr.get(i);
        }
        System.out.println(Arrays.toString(result));




//        int[] newArr = new int[arr.length];
//        int j = 1;
//        int k = 1;
//        for(int i = 0; i < arr.length; i++) {
//            if(arr[i] == 0) {
//                j++;
//                newArr[i] = arr[i];
//                newArr[j] = 8;
//            } else{
//                if(i == 0) {
//                    newArr[i] = arr[i];
//                } else if(i == arr.length - 1){
//                    newArr[i + 1] = arr[i];
//                }
//
//            }
////
//        }
//        System.out.println(Arrays.toString(newArr));
    }
}
