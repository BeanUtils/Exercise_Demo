package com.mabin.stream_demo;

import java.util.ArrayList;
import java.util.List;

public class StreamDemo04 {
    public static void main(String[] args) {

        // 排序操作 sorted
        List<String> list = new ArrayList<>();
        list.add("tangsanzang");
        list.add("lingqingxia");
        list.add("songwukong");
        list.add("hello");
        list.add("zhubajie");
        list.add("白骨精");
        list.add("白龙马");

        list.stream().sorted((s1, s2) -> {
            int num = s1.length() - s2.length();
            int num2 = num == 0 ? s1.compareTo(s2) : num;
            return num2;
        }).forEach(System.out::println);


        System.out.println("========");

        // 类型转换

        List<String> strList = new ArrayList<>();
        strList.add("10");
        strList.add("20");
        strList.add("30");
        strList.add("40");
        strList.add("50");
        strList.add("60");

        //将集合中的元素 String转换成其他类型 输出
        //strList.stream().map(s -> Integer.parseInt(s)).forEach(System.out::println);

        //strList.stream().map(Integer::parseInt).forEach(System.out::println);

        strList.stream().mapToInt(Integer::parseInt).forEach(System.out::println);
        strList.stream().mapToLong(Long::parseLong).forEach(System.out::println);


        //统计个数  count     还有其他数学操作（最值等）
        long count = list.stream().filter(s -> s.startsWith("白")).count();
        System.out.println(count);

    }






}
