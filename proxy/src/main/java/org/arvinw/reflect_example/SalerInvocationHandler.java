package org.arvinw.reflect_example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SalerInvocationHandler implements InvocationHandler {

    People people;

    public SalerInvocationHandler(People people){
        this.people = people;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用代理类");
        if (method.getName().equals("work")){
            System.out.println("中介找到别人代理，给他酬劳。");
            method.invoke(people,args);
        }
        if (method.getName().equals("eat")){
            System.out.println("中介负责员工饮食。");
            method.invoke(people,args);
        }
        return null;
    }
}
