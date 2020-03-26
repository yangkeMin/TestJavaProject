package com.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 线程之-返回值
 * @author yangmin
 * @version 1.0
 * @date 2020/3/24 23:45
 */
public class CallableReturnParam implements Callable<Order> {

    private Order order;

    @Override

    public Order call()throws Exception {
        order = new Order();
        order.setMoney(20);
        order.setOrderCode("2020");
        return  order;
    }

    public static  void main(String[] arg){
        Callable<Order> objCallable = new CallableReturnParam();
        FutureTask<Order> objFuture = new FutureTask<>(objCallable);
        new Thread(objFuture).start();
        try {
            Order objOrder =   objFuture.get();
            System.out.println(objOrder.getOrderCode());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

    }


}

class Order{

    private  String orderCode;

    private int money;

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}


