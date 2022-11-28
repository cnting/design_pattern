package day_57_eventbus;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 用来表示@Subscribe注解的方法
 */
public class ObserverAction {
    //观察者
    private Object target;
    //方法
    private Method method;

    public ObserverAction(Object target, Method method) {
        this.target = Preconditions.checkNotNull(target);
        this.method = method;
        this.method.setAccessible(true);
    }

    //event是method方法的参数
    public void execute(Object event) {
        try {
            method.invoke(target, event);
        } catch (InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
