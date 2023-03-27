package org.arvinw.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Target target = new RealTarget();

        Advice advice = new Advice();

        Target proxy = (Target) Proxy.newProxyInstance(
                RealTarget.class.getClassLoader(),
                RealTarget.class.getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        advice.before();
                        Object invoke = method.invoke(target,args);
                        advice.after();
                        return invoke;
                    }
                }
        );
        proxy.coreWork();
    }
}
