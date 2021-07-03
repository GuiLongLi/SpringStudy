package BeanAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAnnotation {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("BeanAnnotation.xml");
        UserController uc = (UserController)ctx.getBean("userController");
        uc.outContent();
    }
}
