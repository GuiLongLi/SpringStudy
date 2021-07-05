package AOPAspectJXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAspectJXML {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("BeanAOPAspectJXML.xml");
        Man man = (Man)ctx.getBean("man");
        System.out.println(man.getName());
        System.out.println(man.getAge());

        try {
            //捕获异常
            man.throwException();
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}
