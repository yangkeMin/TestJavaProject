package com.thread;

/**
 * @author yangmin
 * @version 1.0
 * @date 2020/3/25 21:27
 */

public class SellTicktDemo  implements Runnable{
    //定义票的总数
    private volatile int  total = 100;

    private String name = "";
    //定义票的编号
    private int no = total+1;
    //定义一个线程同步对象
    private  Object objLock = new Object();

    public SellTicktDemo(String threadName){
        this.name  = threadName;
    }

    @Override
    public void run() {
        while(true){
            synchronized(this.objLock){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if(total>0){
                    String message = "内部售票大厅" +this.name+",外部窗口号："+ Thread.currentThread().getName()+" 售出第   "+(this.no -this.total) +"  张票";;
                    System.out.println(message);
                    total--;
                }else{
                    System.out.println("票已售完，请下次再来！");
                    System.exit(0);
                }

            }
        }
    }
}