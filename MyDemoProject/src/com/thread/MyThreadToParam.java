package com.thread;

import java.awt.*;

/**
 * 线程之-通过变量和方法传递数据
 * @author yangmin
 * @version 1.0
 * @date 2020/3/24 23:16
 */
public class MyThreadToParam implements  Runnable {

    private String name ;

    public void setName(String name){
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name);
    }

    public static  void main(String[] arg){
      MyThreadToParam obj = new MyThreadToParam();
      obj.setName("变量传值");
      Thread objThread = new Thread(obj);
        objThread.start();
    }
}
