package BeanAutoWire;

public class Person3 {
    private Man3 man3;

    public Person3(){
        System.out.println("在person3的无参构造函数内");
    }

    public Person3(Man3 man3){
        System.out.println("在person3的有参构造函数内");
        this.man3 = man3;
    }

    public void manShow(){
        man3.show();
    }


//    使用2）按名称自动装配（autowire="byName"） ，需要配置 get 和 set
    public Man3 getMan() {
        return man3;
    }

    public void setMan(Man3 man3) {
        this.man3 = man3;
    }
}
