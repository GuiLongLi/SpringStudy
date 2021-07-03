package BeanPostProcessor;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPostProcessor {
    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("BeanPostProcessor.xml");
        HelloWorld helloWorld = (HelloWorld)context.getBean("helloWorld");
        helloWorld.getMessage();
        //该类中我们使用 AbstractApplicationContext 类的 registerShutdownHook() 方法，来确保正常关机并调用相关的 destroy() 方法。
        context.registerShutdownHook();
        /**
         由运行结果可以看出，postProcessBeforeInitialization 方法是在 Bean 实例化和依赖注入后，自定义初始化方法前执行的。而 postProcessAfterInitialization 方法是在自定义初始化方法后执行的。
         由于 getOrder 方法返回值越大，优先级越低，所以 InitHelloWorld2 先执行。
        **/
    }
}
