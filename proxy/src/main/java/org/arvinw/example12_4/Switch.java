package org.arvinw.example12_4;

public class Switch implements Intranet{

    @Override
    public void fileAccess(String path) {

        System.out.println("访问内网：" + path);

    }
}
