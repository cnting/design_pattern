package day_41_singleinstance;

/**
 * 双重检测
 * 支持延迟加锁，支持高并发
 */
public class IdGenerator3 {
    private static IdGenerator3 instance;
    private IdGenerator3(){}

    public static IdGenerator3 getInstance(){
        if(instance==null){
            //类级别的锁
            synchronized (IdGenerator3.class){
                if(instance==null){
                    instance = new IdGenerator3();
                }
            }
        }
        return instance;
    }
}
