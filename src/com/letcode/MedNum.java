package com.letcode;

import java.util.*;

/**
 * create by murong
 * create in 2019-3-9
 */
public class MedNum {

    public static Float findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            list.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            list.add(nums2[i]);
        }
        Collections.sort(list);
        return list.size()%2==1?list.get((list.size()-1)/2).floatValue():((list.get(list.size()/2-1)+list.get(list.size()/2))/2F);
    }

    public static void main(String[] args) {
        int[] num1 = new int[]{1,3};
        int[] num2 = new int[]{2,4};
        System.out.println(findMedianSortedArrays(num1, num2));
    }
}
