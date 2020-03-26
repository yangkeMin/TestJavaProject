package com.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yangmin
 * @version 1.0
 * @date 2020/3/22 17:00
 */
public class GCTest {
    public static void main(String[] args) {
        byte[] allocation1, allocation2;
//        allocation1 = ne
//        w byte[30900*1024];
        allocation2 = new byte[900 * 1024];
        List<String> lst = new ArrayList<>();
    }

    /*private String getInt() { return ""; }*/
}
