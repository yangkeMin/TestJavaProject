package com.thread;

/**
 * 线程之-通过回调函数传递数据
 * @author yangmin
 * @version 1.0
 * @date 2020/3/24 23:29
 */
class Data
{
    public int value = 0;
}
class Work
{
    public void process(Data data, Integer... numbers)
    {
        for (int n : numbers)
        {
            data.value += n;
        }
    }
}
public class MyThread3 extends Thread
{
    private Work work;
    public MyThread3(Work work)
    {
        this.work = work;
    }
    public void run()
    {
        java.util.Random random = new java.util.Random();
        Data data = new Data();
        int n1 = random.nextInt(1000);
        System.out.println("n1="+n1);
        int n2 = random.nextInt(2000);
        int n3 = random.nextInt(3000);
        work.process(data, n1, n2, n3); // 使用回调函数
        System.out.println(String.valueOf(n1) + "+" + String.valueOf(n2) + "+"
                + String.valueOf(n3) + "=" + data.value);
    }
    public static void main(String[] args)
    {
        Thread thread = new MyThread3(new Work());
        thread.start();
    }
}