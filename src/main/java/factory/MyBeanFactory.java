package factory;

import dao.Person2;

public class MyBeanFactory {
    /**
     静态工厂实例化bean
    **/
    public static Person2 createBean(){
        return new Person2();
    }
}
