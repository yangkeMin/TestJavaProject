package com.thread;

/**
 * 线程之传递参数
 *
 *
 * @author yangmin
 * @version 1.0
 * @date 2020/3/24 23:08
 */
public class MyThread1 extends Thread{
    private String name;
    public MyThread1(String name){
        this.name= name;
    }

    public void run(){
        System.out.println(this.name);
    }
   public static  void main(String[] arg){
       Thread obj = new  MyThread1("传参数");
       obj.start();
    }

}
