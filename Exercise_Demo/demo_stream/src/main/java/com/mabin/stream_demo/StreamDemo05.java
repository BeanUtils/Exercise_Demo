package com.mabin.stream_demo;


import com.mabin.stream_demo.model.Actor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo05 {
    public static void main(String[] args) {

        List<String> manList = new ArrayList<>();
        manList.add("周润发");
        manList.add("成龙");
        manList.add("刘德华");
        manList.add("吴京");
        manList.add("周星驰");
        manList.add("李连杰");

        List<String> womanList = new ArrayList<>();
        womanList.add("赵薇");
        womanList.add("林心如");
        womanList.add("赵丽颖");
        womanList.add("范冰冰");
        womanList.add("林青霞");
        womanList.add("张曼玉");


        //1. 男演员只要名字为三个字的前三人
        //Stream<String> stream1 = manList.stream().filter(s -> s.length() == 3).limit(3);

        //2. 女演员只要姓林的，并且不要第一个
        //Stream<String> stream2 = womanList.stream().filter(s -> s.startsWith("lin")).skip(1);

        //3. 合并上面两个流
        //Stream<String> stream = Stream.concat(stream1, stream2);

        //4. 把上一步操作后的元素作为构造方法的参数创建演员对象，遍历
        //stream.map(Actor::new).forEach(p-> System.out.println(p.getName()));


        // 以上操作一步写出来
        Stream.concat(manList.stream().filter(s -> s.length() == 3).limit(3), womanList.stream().filter(s -> s.startsWith("林")).skip(1)).map(Actor::new).forEach(p -> System.out.println(p.getName()));
    }
}
