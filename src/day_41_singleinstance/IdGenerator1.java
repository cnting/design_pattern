package day_41_singleinstance;

/**
 * 饿汉式
 * 不支持延迟加载
 */
public class IdGenerator1 {
    private static final IdGenerator1 instance = new IdGenerator1();

    private IdGenerator1() {
    }

    public static IdGenerator1 getInstance() {
        return instance;
    }
}
