package BeanAutoWire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("BeanAutoWire.xml");
        Person person1 = (Person)context.getBean("person1");
        person1.manShow();

        Person person = (Person)context.getBean("person");
        person.manShow();

        Person3 person3 = (Person3)context.getBean("person3");
        person3.manShow();

        Person4 person4 = (Person4)context.getBean("person4");
        person4.manShow();
    }
}
