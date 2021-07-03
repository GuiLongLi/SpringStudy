package BeanPostProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.Ordered;
//BeanPostProcessor 接口也被称为后置处理器，通过该接口可以自定义调用初始化前后执行的操作方法。
public class InitHelloWorld implements BeanPostProcessor, Ordered {
    /**
     postProcessBeforeInitialization 在 Bean 实例化、依赖注入后，初始化前调用。
     postProcessAfterInitialization 在 Bean 实例化、依赖注入、初始化都完成后调用。

     当需要添加多个后置处理器实现类时，默认情况下 Spring 容器会根据后置处理器的定义顺序来依次调用。也可以通过实现 Ordered 接口的 getOrder 方法指定后置处理器的执行顺序。该方法返回值为整数，默认值为 0，值越大优先级越低。
     **/
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("A before : "+beanName);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("A after : "+beanName);
        return bean;
    }

    @Override
    public int getOrder() {
        return 5;
    }
}
