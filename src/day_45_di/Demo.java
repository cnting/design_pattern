package day_45_di;

import day_45_di.context.ApplicationContext;
import day_45_di.context.ClassPathXmlApplicationContext;

public class Demo {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
//        XXX bean = applicationContext.getBean("XXX");
    }
}
