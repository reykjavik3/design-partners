package com.letcode;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;

/**
 * create by murong
 * create in 2019-3-9
 */
public class TestSet<K,V> {
    K obj;
    private static final Object PRESENT = new Object();
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>() {{
            add("spring");
            add("mybatis");
        }};

        boolean spring = set.remove("spring");
        System.out.println(spring);

        }
        @Test
        public void test(){
        boolean a = obj ==PRESENT;
            System.out.println(a);
        }
}
