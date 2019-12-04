package com.mabin.stream_demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo06 {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("王宁");
        strList.add("王轮");
        strList.add("郜凯");
        strList.add("马斌");
        strList.add("梁伟");

        // 1.1 得到姓王的流
        Stream<String> strStream = strList.stream().filter(s -> s.startsWith("王")).limit(2);
        // 1.2 将数据收集到 Set 集合中
        Set<String> collect = strStream.collect(Collectors.toSet());
        for (String s : collect) {
            System.out.println(s);
        }

        System.out.println("==========");


        Set<Integer> intSet = new HashSet<>();
        intSet.add(24);
        intSet.add(12);
        intSet.add(30);
        intSet.add(18);
        intSet.add(45);
        intSet.add(21);

        //2.1 得到大于20 除了第一个的 流
        Stream<Integer> integerStream = intSet.stream().filter(s -> s > 20).skip(1);
        //2.2 将数据手机到 List 集合中
        List<Integer> integerList = integerStream.collect(Collectors.toList());
        for (Integer integer : integerList) {
            System.out.println(integer);
        }




        //3.1
        String[] strArray = {"王伦,21","王宁,24","马斌,28","郜凯,25"};

        Stream<String> stringStream = Stream.of(strArray).filter(s -> Integer.parseInt(s.split(",")[1]) > 22);

        Map<String, Integer> map = stringStream.collect(Collectors.toMap(s -> s.split(",")[0], s -> Integer.parseInt(s.split(",")[1])));

        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            Integer integer = map.get(s);
            System.out.println(s+":"+integer);
        }
    }
}
