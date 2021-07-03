package BeanInherit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestInherit {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanInherit.xml");

        HelloWorld obj1 = (HelloWorld)context.getBean("helloWorld");
        obj1.getMessage1();
        obj1.getMessage2();
        System.out.println();

        HelloChina obj2 = (HelloChina)context.getBean("helloChina");
        obj2.getMessage1();
        obj2.getMessage2();
        obj2.getMessage3();
        System.out.println();

        HelloChina obj3 = (HelloChina)context.getBean("helloChina2");
        obj3.getMessage1();
        obj3.getMessage2();
        obj3.getMessage3();
    }
}
