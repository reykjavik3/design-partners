package com.letcode;

import java.util.HashMap;

/**
 * create by murong
 * create in 2019-3-3
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoNumAdd {
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) throws Exception{
        int [] nums = new int[]{2,7,11,15};
        int[] ints = twoSumOneHash(nums, 13);

//        int[] ints = twoSum(integers, 18);
//        int[] ints = twoSumHash(integers, 17);
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }

    private static int[] twoSumOneHash(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target-nums[i])) return new int[]{map.get(target-nums[i]),i };
            map.put(nums[i],i);
        }
        return null;
    }

    private static int[] twoSumHash(int[] integers,int num) throws Exception {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < integers.length; i++) {
            map.put(integers[i],i);
        }
        for (int i = 0; i < integers.length; i++) {
            if(map.containsKey(num-integers[i])&&i!=map.get(num-integers[i])) {
                return new int[]{i,map.get(num-integers[i])};
            }
        }
        throw new Exception("no have num");
    }
}
