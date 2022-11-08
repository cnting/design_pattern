package day_41_singleinstance;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉式
 * 方法上加锁，有性能问题，不支持高并发
 */
public class IdGenerator2 {
    private AtomicLong id = new AtomicLong(0);
    private static IdGenerator2 instance;
    private IdGenerator2(){}

    //实例级别的锁
    public static synchronized IdGenerator2 getInstance(){
        if(instance==null){
            instance = new IdGenerator2();
        }
        return instance;
    }


}
