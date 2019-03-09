package com.letcode;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * create by murong
 * create in
 */
public class Lambda {
//    public static void main(String[] args) {
//        Teacher teacher1 = new Teacher("spring",23);
//        Teacher teacher3 = new Teacher("spring",35);
//        Teacher teacher2 = new Teacher("Tomcat",18);
//        ArrayList<Teacher> list = new ArrayList<Teacher>();
//        list.add(teacher1);
//        list.add(teacher2);
//        ArrayList<Teacher> list1 = new ArrayList<>();
//        list1.add(teacher3);
////        testFilter(list);
////        testMap(list);
////        testFlatMap(list,list1);
////        testMin(list);
////        testReduce();
//        String aa = (String)null;
//        System.out.println(aa);
//    }
//
//    private static void testReduce() {
//        Integer reduce = Stream.of(1, 2, 3).reduce(0, (acc, element) -> acc + element);
//        System.out.println(reduce);
//    }
//
//    private static void testMin(ArrayList<Teacher> list) {
//        Teacher teacher1 = list.stream().min(Comparator.comparing(teacher -> teacher.getAge())).get();
//        System.out.println(teacher1);
//    }
//
//    private static void testFlatMap(ArrayList<Teacher> list, ArrayList<Teacher> list1) {
//        List<Teacher> collect = Stream.of(list, list1).flatMap(teachers -> teachers.stream()).collect(Collectors.toList());
//        collect.forEach(teacher -> System.out.println(teacher.getName()));
//
//    }
//
//    private static void testMap(ArrayList<Teacher> list) {
//        List<String> collect = list.stream().filter(teacher -> teacher.getName().equals("spring"))
//                .map(teacher -> teacher.getName()).collect(Collectors.toList());
//        collect.forEach(s -> System.out.println(s));
//
//    }
//
//    private static void testFilter(ArrayList<Teacher> list) {
//        long spring = list.stream().filter(teacher -> teacher.getName().equals("spring")).count();
//        System.out.println(spring);
//    }
}
