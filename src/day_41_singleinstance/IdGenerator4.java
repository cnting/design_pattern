package day_41_singleinstance;

/**
 * 静态内部类
 */
public class IdGenerator4 {
    private IdGenerator4() {
    }

    /**
     * 外部类加载时，不会创建SingletonHolder实例对象，只有调用getInstance()时才会被加载
     * 此时instance的唯一性和线程安全由JVM来保证
     */
    private static class SingletonHolder {
        private static final IdGenerator4 instance = new IdGenerator4();
    }

    public static IdGenerator4 getInstance() {
        return SingletonHolder.instance;
    }
}
