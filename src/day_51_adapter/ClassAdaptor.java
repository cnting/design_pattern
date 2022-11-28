package day_51_adapter;

/**
 * 类适配器，将Adaptee转换为一组符号ITarget接口定义的接口
 */
public class ClassAdaptor extends Adaptee implements ITarget {
    @Override
    public void f1() {
        super.fa();
    }

    @Override
    public void f2() {
        super.fb();
    }

    // 这里fc()不需要实现，直接继承自Adaptee，这是跟对象适配器最大的不同点
}
