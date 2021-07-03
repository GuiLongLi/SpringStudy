package BeanDependencyInjection;

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

    public void setMan(Man man) {
        this.man = man;
    }
}
