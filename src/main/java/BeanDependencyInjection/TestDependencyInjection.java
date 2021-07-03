package BeanDependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDependencyInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanDependencyInjection.xml");
        Person person = (Person)context.getBean("person");
        person.manShow();

        Person person2 = (Person)context.getBean("person2");
        person2.manShow();

        Person person3 = (Person)context.getBean("person3");
        person3.manShow();
    }
}
