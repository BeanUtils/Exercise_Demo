package com.mabin.stream_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo03 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("唐三藏");
        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("白龙马");
        list.add("白骨精");
        list.add("白蛇");


        //1. 过滤操作 filter
        //1.1 把集合中以 白 开头的元素在控制台输出
        list.stream().filter(s->s.startsWith("白")).forEach(System.out::println);
        System.out.println("--------");

        //1.2 把集合中长度为3 的元素输出
        list.stream().filter(s->s.length()==3).forEach(System.out::println);
        System.out.println("--------");

        //1.3 把集合中以 白 开头，长度为3 的元素输出
        list.stream().filter(s->s.startsWith("白")).filter(s->s.length()>2).forEach(System.out::println);
        System.out.println("========");

        //2. 截取操作 limit/skip
        //2.1 取集合中前三个元素输出
        list.stream().limit(3).forEach(System.out::println);
        System.out.println("--------");

        //2.2 跳过前三个元素，将集合中剩下的元素输出
        list.stream().skip(3).forEach(System.out::println);
        System.out.println("--------");

        //2.3 跳过2个元素，剩下的取前3个输出
        list.stream().skip(3).limit(2).forEach(System.out::println);
        System.out.println("--------");

        //2.4 取前五个中的后三个元素
        list.stream().limit(5).skip(2).forEach(System.out::println);
        System.out.println("========");


        //3. 重组操作  concat/distinct

        //3.1 先创建两个流
        Stream<String> stream1 = list.stream().limit(4);
        Stream<String> stream2 = list.stream().skip(2);
        // 3.2 合并这两个流
        //Stream.concat(stream1,stream2).forEach(System.out::println);
        System.out.println("--------");
        // 3.3 合并这两个流，并要求元素不能重复
        Stream.concat(stream1,stream2).distinct().forEach(System.out::println);


    }
}
