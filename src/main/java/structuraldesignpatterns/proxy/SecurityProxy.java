package structuraldesignpatterns.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static java.lang.reflect.Proxy.newProxyInstance;

public class SecurityProxy implements InvocationHandler {

    private Object object;
    private SecurityProxy(Object object) {
        this.object=object;
    }

    public static Object newInstance(Object object){
        return newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces()
        ,new SecurityProxy(object));
    }

    @Override
    public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
        Object result;
        try{
            result= method.invoke(obj,args);
        }catch (InvocationTargetException targetException){
            throw targetException.getTargetException();
        }catch (Exception e){
            throw new RuntimeException("Unexpected invocation exeception : " + e.getMessage());
        }
      return result;
    }
}
