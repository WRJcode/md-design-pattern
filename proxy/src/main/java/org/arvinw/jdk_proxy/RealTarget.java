package org.arvinw.jdk_proxy;

public class RealTarget implements Target{
    @Override
    public void coreWork() {
        System.out.println("==核心业务方法运行==");
    }
}
