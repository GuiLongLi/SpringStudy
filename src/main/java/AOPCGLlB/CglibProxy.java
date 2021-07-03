package AOPCGLlB;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
CGLIB动态代理，实现MethodInterceptor接口
**/
public class CglibProxy implements MethodInterceptor {
    private Object target; //需要代理的目标对象
    final MyAspect myAspect = new MyAspect();

    /**
    重写拦截方法
    **/
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        myAspect.myBefore();
        Object invoke = method.invoke(target,objects); //方法执行，参数：target目标对象 objects参数数组
        myAspect.myAfter();
        return invoke;
    }

    /**
    定义获取代理对象方法
    **/
    public Object getCglibProxy(Object objectTarget){
        /**
        为目标对象target赋值
        **/
        this.target = objectTarget;
        Enhancer enhancer = new Enhancer();
        /**
        设置父类，因为CGLIB是针对指定的类生成的一个子类，所以需要指定父类
        **/
        enhancer.setSuperclass(objectTarget.getClass());
        enhancer.setCallback(this); //设置回调
        Object result = enhancer.create(); //创建并返回代理对象
        return result;
    }

    public static void main(String[] args) {
        CglibProxy cglibProxy = new CglibProxy(); //实例化CglibProxy对象
    }
}
