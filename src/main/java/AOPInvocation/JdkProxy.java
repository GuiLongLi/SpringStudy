package AOPInvocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
使用JDK动态代理InvocationHandler接口
Spring JDK 动态代理需要实现 InvocationHandler 接口，重写 invoke 方法，客户端使用 Java.lang.reflect.Proxy 类产生动态代理类的对象。
**/
public class JdkProxy implements InvocationHandler {
    private Object target; //需要代理的目标对象
    final MyAspect myAspect = new MyAspect();

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        myAspect.myBefore();
        Object result = method.invoke(target,args);
        myAspect.myAfter();
        return result;
    }
    
    /**
    定义获取代理对象方法
    **/
    private Object getJDKProxy(Object targetOjbect){
        /**
        为目标对象target赋值
        **/
        this.target = targetOjbect;
        
        /**
        JDK动态代理只能代理实现了接口的类，从newProxyInstance函数所需的参数就可以看出来
        **/
        return Proxy.newProxyInstance(targetOjbect.getClass().getClassLoader(),targetOjbect.getClass().getInterfaces(),this);
    }

    public static void main(String[] args) {
        JdkProxy jdkProxy = new JdkProxy();//实例化JDKProxy对象
        UserManager user = (UserManager)jdkProxy.getJDKProxy(new UserManagerImpl()); //获取代理对象
        user.addUser("新增用户","新增用户密码"); //执行新增
        user.delUser("删除用户"); //执行删除
    }
}
