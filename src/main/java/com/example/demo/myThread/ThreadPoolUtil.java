package com.example.demo.myThread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * java 线程池
 */
public class ThreadPoolUtil {
    static BlockingQueue<Runnable> waitQueue = new LinkedBlockingQueue<>(10);

    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = threadExecutors();


        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("被执行，线程名：" + Thread.currentThread().getName() + ',');
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // 1 线程资源 -> 9
        threadPoolExecutor.execute(runnable);  //alive
        threadPoolExecutor.execute(runnable); //in queue
        threadPoolExecutor.execute(runnable); //in queue
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);
        System.out.println(waitQueue.size());
        //拒绝
        threadPoolExecutor.execute(runnable);
        threadPoolExecutor.execute(runnable);






    }



    public static ThreadPoolExecutor threadExecutors() {

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
                1,
                3,
                30,
                TimeUnit.SECONDS,
                waitQueue
        );
        return threadPoolExecutor;

    }
}
