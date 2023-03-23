package org.arvinw.example12_3;

public class Client {

    /**
     *
     * @param args
     * @throws Exception
     * 代理模式：实际提供服务的人不会变，只是有人替你负重前行；代理方可能会做一些其他事情。
     */

    public static void main(String[] args) throws Exception {

        Internet proxy = new RouterProxy();
        proxy.httpAccess("https://www.电影.com");
        proxy.httpAccess("https://www.游戏.com");
        proxy.httpAccess("https://www.学习.com");
        proxy.httpAccess("https://www.工作.com");

    }
}
