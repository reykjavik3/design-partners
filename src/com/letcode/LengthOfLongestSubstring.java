package com.letcode;

import java.util.HashMap;

/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:

输入: "abcabcbb"
输出: 3
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:

输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
示例 3:

输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class LengthOfLongestSubstring {
    public static int lengthOfLongestSubstring(String s) {
        if(s.length()<2)return s.length();
        int length = 0;
        int lengthMax = 0;
        char[] chars = s.toCharArray();
        HashMap<Character,Character> map = new HashMap<Character, Character>();
        int pre = 0;
        int cur = 0;
        while(true){
            if(cur==chars.length-1){
                if(pre==0){
                    Character character = map.get(chars[cur]);
                    if(character==null){
                        return s.length();
                    }else{
                        return s.length()-1;
                    }
                }
                Character character = map.get(chars[cur]);
                if(character==null){
                    length++;
                }
                pre++;
                cur = pre;
                if(length>lengthMax){
                    lengthMax = length;
                }
                length=0;
                map.clear();
            }
            Character character = map.get(chars[cur]);
            if(pre==chars.length-1){
                return lengthMax>length?lengthMax:length;
            }
            if(character==null){
                map.put(chars[cur],chars[cur]);
                cur++;
                length++;
            }else{
                pre++;
                cur = pre;
                if(length>lengthMax){
                    lengthMax = length;
                }
                map.clear();
                length=0;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("cdd"));
    }
}
