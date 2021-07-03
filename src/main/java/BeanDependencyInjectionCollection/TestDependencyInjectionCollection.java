package BeanDependencyInjectionCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependencyInjectionCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanDependencyInjectionCollection.xml");
        Collection collection = (Collection)context.getBean("collection");
        collection.getManList();
        collection.getManMap();
        collection.getManProp();
        collection.getManSet();

        Collection collection2 = (Collection)context.getBean("collection2");
        collection2.getManList();
    }
}
