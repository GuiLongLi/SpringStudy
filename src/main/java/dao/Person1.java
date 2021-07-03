package dao;

public class Person1 {
    /**
    定义bean属性
    **/
    private String message;
    public void setMessage(String message) {
        this.message = message;
    }
    public void getMessage() {
        System.out.println("message : " + message);
    }
    
    /**
     * 初始化回调
     通过配置xml调用bean初始化后执行的方法
     **/
    public void init(){
        System.out.println("调用init--method指定的初始化方法:init");
    }

    /**
     * 销毁回调
    通过配置xml调用bean销毁后执行的方法
    **/
    public void destroy(){
        System.out.println("调用destory-method指定的销毁方法:destroy");
    }
}
