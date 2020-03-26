package com.jvm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author yangmin
 * @version 1.0
 * @date 2020/3/22 17:57
 */
public class TestFor {
    public static void main(String[] args) throws InterruptedException {
      int i = 11111;
       List<String> lst  = new ArrayList<>(10);
        System.out.println(lst.size());
        lst.add("1111");

        System.out.println(lst.size());

        HashMap<String,Object> map = new HashMap<>();
        map.put("123",456);
        Hashtable<String,Object> table = new Hashtable<>();
        table.put("111",111);
        ConcurrentHashMap<String,Object> cHashMap = new ConcurrentHashMap<>();
        cHashMap.put("123","");
    }
}
