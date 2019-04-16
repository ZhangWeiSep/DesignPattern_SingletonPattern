package com.example.demo;

/**
 * 单例实体对象
 * 饿汉式单例模式
 * @pathName：Singleton
 * @author：ZhangWei
 */
public class Singleton {

    //创建单例对象
    public static final Singleton SINGLETON = new Singleton();

    /**
     * 限制产生多个对象
     */
    private Singleton() {
    }

    /**
     * 获取单例对象
     *
     * @return
     */
    public static Singleton getSingleton() {
        return SINGLETON;
    }

}
