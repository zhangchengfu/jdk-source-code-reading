package com.lanhuigu.thread.waitnotify.notifyall;

/**
 * @author yihonglei
 *  2019/2/15 11:22
 */
public class ThreadB extends Thread {
    private Object lock;

    public ThreadB(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        MyService service = new MyService();
        service.serviceMethod(lock);
    }
}
