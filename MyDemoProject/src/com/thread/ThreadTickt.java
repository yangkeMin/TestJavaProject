package com.thread;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 多线程之-售票
 *
 * @author yangmin
 * @version 1.0
 * @date 2020/3/25 21:11
 */
public class ThreadTickt {

    public static  void main(String[] arg){
       Runnable runnable = new  SellTicktDemo("售票大厅");
       Thread thread1 = new Thread(runnable,"售票窗口1");
       Thread thread2 = new Thread(runnable,"售票窗口2");
        Thread thread3 = new Thread(runnable,"售票窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
        AtomicReference obj = new AtomicReference();
    }
}

