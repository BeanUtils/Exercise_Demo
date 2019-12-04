package com.mabin.stream_demo;

import java.util.ArrayList;
import java.util.List;


/**
 * Stream流 初体验
 */
public class StreamDemo {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();

        list.add("孙悟空");
        list.add("猪八戒");
        list.add("沙和尚");
        list.add("白龙马");
        list.add("白骨精");
        list.add("白蛇");
        list.add("唐三藏");

        //1. 将集合中以"白"开头的元素存储到一个新的集合
        List<String> list1 = new ArrayList<String>();
        for (String s : list) {
            if(s.startsWith("白")){
                list1.add(s);
            }
        }

        //2. 将"白"开头的集合中长度为3 的元素储存到一个新的集合
        List<String> list2 = new ArrayList<String>();
        for (String s : list1) {
            if (s.length()==3){
                list2.add(s);
            }
        }

        System.out.println(list2);



        // 用stream流来改进以上2步操作；
        list.stream().filter(s->s.startsWith("白")).filter(s->s.length()==3).forEach(System.out::println);
    }
}
