package Task1;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

        You may assume that each input would have exactly one solution, and you may not use the same element twice.

        You can return the answer in any order. */

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {


        int[] nums = {5, 11, 4, 3};
        int target = 9;
        int[] k = new int[2];

        HashMap<Integer, Integer> hashmap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (!hashmap.containsKey(nums[i])) {

                int n = target - nums[i];

                hashmap.put(n, i);

            } else {

                k[0] = i;
                k[1] = hashmap.get(nums[i]);
                break;

            }
        }

        System.out.println(" Indices of the two numbers such that they add up to " + target + " : " + Arrays.toString(k));

    }
}

