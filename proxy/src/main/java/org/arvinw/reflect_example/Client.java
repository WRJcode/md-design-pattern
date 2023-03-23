package org.arvinw.reflect_example;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        People people = new Saler();

        SalerInvocationHandler salerInvocationHandler = new SalerInvocationHandler(people);

        People proxyClass = (People) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{People.class},salerInvocationHandler);

        proxyClass.work();

        proxyClass.eat();
    }
}
