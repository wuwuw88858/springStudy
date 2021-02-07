package com.thread.demo.Singleton;

/**
 * 懒汉式
 */
public class LazySingleton {
    private static LazySingleton ourInstance = null;

    public static LazySingleton getInstance() throws InterruptedException {

        // 双重校验锁
        if (null == ourInstance) {
            Thread.sleep(1000L);
            synchronized (LazySingleton.class) {
                if (null == ourInstance) {
                    ourInstance = new LazySingleton();
                }
            }
        }
        return ourInstance;
    }

    private LazySingleton() {

    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                try {
                    System.out.println(LazySingleton.getInstance());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }).start();
        }
    }


}
