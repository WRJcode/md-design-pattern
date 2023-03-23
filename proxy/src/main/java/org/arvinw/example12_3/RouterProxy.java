package org.arvinw.example12_3;

import java.util.Arrays;
import java.util.List;

public class RouterProxy implements Internet{

    private Internet modem;
    private List<String> blackList = Arrays.asList("电影","游戏","音乐","小说");

    public RouterProxy() throws Exception {
        this.modem = new Modem("123456");
    }

    @Override
    public void httpAccess(String url) {
        for (String keyword:blackList){
            if (url.contains(keyword)){
                System.out.println("禁止访问" + url);
                return;
            }
        }
        modem.httpAccess(url);
    }
}
