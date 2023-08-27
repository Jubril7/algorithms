package org.example;

public class Triplets {
    public static void main(String[] args) {
        validTriplet(new int[] {1,0,1,2,-1,2}, 3);
    }

    static boolean validTriplet(int[] nums, int n) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 1; j < nums.length; j++) {
                for(int k = 2; k < nums.length; k++){
                    System.out.println(nums[i] + " " + nums[j] + " " + nums[k]);
                }
            }
        }

        return true;
    }
}
