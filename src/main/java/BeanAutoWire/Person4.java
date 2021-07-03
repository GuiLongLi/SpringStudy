package BeanAutoWire;

public class Person4 {
    private Man4 man4;

    public Person4(){
        System.out.println("在person4的无参构造函数内");
    }

    public Person4(Man4 man4){
        System.out.println("在person4的有参构造函数内");
        this.man4 = man4;
    }

    public void manShow(){
        man4.show();
    }


//    使用2）按名称自动装配（autowire="byName"） ，需要配置 get 和 set
    public Man4 getMan() {
        return man4;
    }

    public void setMan(Man4 man4) {
        this.man4 = man4;
    }
}
