import dao.Person1;
import org.junit.Test;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest1 {
    /**
    构造器实例化bean
    **/
    @Test
    public void test(){
        //初始化Spring容器，加载配置文件，并对bean进行实例化
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器id获取实例
        Person1 person1 = (Person1) applicationContext.getBean("person1");
        System.out.println(person1);
        person1.getMessage();
        //该类中我们使用 AbstractApplicationContext 类的 registerShutdownHook() 方法，来确保正常关机并调用相关的 destroy() 方法。
        applicationContext.registerShutdownHook();
    }
}
