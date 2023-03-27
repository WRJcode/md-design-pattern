package org.arvinw.cligb_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Client {
    public static void main(String[] args) {
        Target target = new Target();
        Advic advic = new Advic();

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            advic.before();
            Object invoke = method.invoke(target,args);
            advic.after();
            return invoke;
        });

        Target proxy = (Target) enhancer.create();
        proxy.coreWork();
    }
}
