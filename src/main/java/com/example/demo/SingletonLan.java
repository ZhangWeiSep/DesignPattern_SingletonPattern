package com.example.demo;

/**
 * 单例实体对象
 * 懒汉式单例模式
 * @pathName：SingletonLan
 * @author：ZhangWei
 */
public class SingletonLan {

    //创建单例对象
    public static SingletonLan singletonLan = null;

    /**
     * 限制参数多个对象
     */
    public SingletonLan() {

    }

    /**
     * 获取单例对象
     * synchronized：避免多线程使用时创建多个对象
     * 例如线程A走到了“new SingletonLan()”，线程B走到了“singletonLan == null”，这时线程B的条件结果是成立的
     * 这种情况就会产生线程A生产了一个对象，线程B也生产了一个对象，在内存中就会出现两个对象
     * @return
     */
    public static synchronized SingletonLan getSingletonLan() {
        if (singletonLan == null)
            singletonLan = new SingletonLan();
        return singletonLan;
    }

}
