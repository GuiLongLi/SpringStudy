package BeanPostProcessor;

public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void init(){
        System.out.println("Bean正在初始化");
    }

    public void destroy(){
        System.out.println("Bean将要被销毁");
    }
}
