package com.mabin.stream_demo;

import java.util.*;
import java.util.stream.Stream;

/**
 * stream流 的三种生成方式
 */
public class StreamDemo02 {
    public static void main(String[] args) {

        //Connection体系集合用默认方法stream()生成流
        List<String> list = new ArrayList<>();
        Stream<String> listStream = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> setStream = set.stream();


        //Map体系的集合间接生成流
        Map<String, String> map = new HashMap<String, String>();
        Stream<String> keyStream = map.keySet().stream();
        Stream<String> valuesStream = map.values().stream();
        Stream<Map.Entry<String, String>> entryStream = map.entrySet().stream();


        //数组可以通过stream接口的静态方法of(T... value)生成流
        String[] strArray = {"hello", "world", "java"};
        Stream<String> strArray1 = Stream.of(strArray);
        Stream<String> stringStream = Stream.of("hello", "world", "java");
        Stream<Integer> integerStream = Stream.of(1, 2, 3);


    }
}
