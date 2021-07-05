package AOPAspectJXML;

public class Logging {
    /**
    前置通知
    **/
    public void beforeAdvice(){
        System.out.println("前置通知");
    }

    /**
    后置通知
    **/
    public void afterAdvice(){
        System.out.println("后置通知");
    }

    /**
    返回后通知
    **/
    public void afterReturningAdvice(Object retVal){
        System.out.println("返回值为："+retVal.toString());
    }

    /**
    抛出异常通知
    **/
    public void afterThrowingAdvice(IllegalArgumentException ex){
        System.out.println("这里的异常为："+ex.toString());
    }
}
