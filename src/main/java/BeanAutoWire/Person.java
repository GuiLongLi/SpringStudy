package BeanAutoWire;

public class Person {
    private Man man;

    public Person(){
        System.out.println("在person的无参构造函数内");
    }

    public Person(Man man){
        System.out.println("在person的有参构造函数内");
        this.man = man;
    }

    public void manShow(){
        man.show();
    }


//    使用2）按名称自动装配（autowire="byName"） ，需要配置 get 和 set
    public Man getMan() {
        return man;
    }

    public void setMan(Man man) {
        this.man = man;
    }
}
