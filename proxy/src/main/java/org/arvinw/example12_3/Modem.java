package org.arvinw.example12_3;

public class Modem implements Internet{

    public Modem(String password) throws Exception {
        if (!"123456".equals(password)){
            throw new Exception("拨号失败，请重试！");
        }
    }

    @Override
    public void httpAccess(String url) {
          System.out.println("正在访问：" + url);
    }
}
