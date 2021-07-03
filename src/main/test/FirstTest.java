import dao.PersonService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FirstTest {
    @Test
    public void test1(){
        //初始化Spring容器，加载配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取personDao实例
        PersonService personService = (PersonService) applicationContext.getBean("personService");
        //调用personService的addPerson()方法
        personService.addPerson();
    }
}
