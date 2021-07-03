import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InstanceTest2 {
    @Test
    public void test(){
        //初始化Spring容器，加载配置文件，并对bean实例化
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器id获取实例
        System.out.println(applicationContext.getBean("person2"));
    }
}
