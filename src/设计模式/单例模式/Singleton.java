package 设计模式.单例模式;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class Singleton {
    private volatile static Singleton uniqueInstance;

    public Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    public static Singleton getInstance1() {//懒汉式 线程不安全
        //以下实现中，私有静态变量 uniqueInstance 被延迟实例化，这样做的好处是，如果没有用到该类，那么就不会实例化 uniqueInstance，从而节约资源。
        //
        //这个实现在多线程环境下是不安全的，
        // 如果多个线程能够同时进入
        // if (uniqueInstance == null) ，
        // 并且此时 uniqueInstance 为 null，
        // 那么会有多个线程执行 uniqueInstance = new 设计模式.单例模式.Singleton();
        // 语句，这将导致实例化多次 uniqueInstance。
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public static synchronized Singleton getInstance2() {//懒汉式 线程安全
        //只需要对 getUniqueInstance() 方法加锁，那么在一个时间点只能有一个线程能够进入该方法，从而避免了实例化多次 uniqueInstance。
        //
        //但是当一个线程进入该方法之后，
        // 其它试图进入该方法的线程都必须等待，
        // 即使 uniqueInstance 已经被实例化了。
        // 这会让线程阻塞时间过长，因此该方法有性能问题，不推荐使用
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

}
