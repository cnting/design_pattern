package day_45_di.context;

import day_45_di.factory.BeansFactory;
import day_45_di.parser.BeanConfigParser;
import day_45_di.parser.BeanDefinition;
import day_45_di.parser.XmlBeanConfigParser;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ClassPathXmlApplicationContext implements ApplicationContext {
    private BeansFactory beansFactory;
    private BeanConfigParser beanConfigParser;

    public ClassPathXmlApplicationContext(String configLocation) {
        this.beansFactory = new BeansFactory();
        this.beanConfigParser = new XmlBeanConfigParser();
        loadBeanDefinitions(configLocation);
    }

    private void loadBeanDefinitions(String configLocation) {
        try (InputStream inputStream = this.getClass().getResourceAsStream("/" + configLocation);) {
            List<BeanDefinition> beanDefinitionList = beanConfigParser.parse(inputStream);
            beansFactory.addBeanDefinition(beanDefinitionList);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    @Override
    public Object getBean(String beanId) {
        return beansFactory.getBean(beanId);
    }
}
