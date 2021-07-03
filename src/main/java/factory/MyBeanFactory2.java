package factory;

import dao.Person3;

public class MyBeanFactory2 {
    public MyBeanFactory2(){
        System.out.println("person3工厂实例化中");
    }
    //创建bean的方法
    public Person3 createBean(){
        return new Person3();
    }
}
