package com.dnj.study.week7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @ClassName MapTest
 * @Description TODO
 * @Author dnj
 * @Date 2020/11/16
 **/
public class MapTest {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>(8);

        map.put("apple",12);
        map.put("pear",8);
        map.put("banana",24);

        //for循环遍历
        for (String key:map.keySet()){
            Integer value = map.get(key);
            System.out.println(key + "单价为：" + value);
        }

        //编写国家——首都的map数据
        Map<String,String> cc = new HashMap<>();
        cc.put("中国","北京");
        cc.put("日本","东京");
        cc.put("美国","纽约");
        cc.put("英国","伦敦");

        System.out.println("通过遍历map的keyset，遍历key和value");
        for(String key:cc.keySet()){
            String captial = cc.get(key);
            System.out.println(key +"的首都为" +captial);
        }
        System.out.println("==========================");
        System.out.println("iterator遍历");
        Iterator<Map.Entry<String,String>> iterator = cc.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String,String> entry = iterator.next();
            System.out.println(entry.getKey() +"的首都为" + entry.getValue());
        }
        System.out.println("==========================");
        System.out.println("通过遍历map的entrySet，遍历key和value");
        for(Map.Entry<String,String> entry : cc.entrySet()){
            System.out.println(entry.getKey() + "的首都为" + entry.getValue());
        }
        System.out.println("==========================");
        System.out.println("通过遍历map的value 只能遍历value不能遍历key");
        for(String value : cc.values()){
            System.out.println(value);
        }

        System.out.println("==========================");
        System.out.println("lambda表达式遍历");
        cc.forEach((key,value) -> System.out.println(  key +"的首都为" + value));
    }
}

