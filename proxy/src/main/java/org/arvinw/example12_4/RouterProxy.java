package org.arvinw.example12_4;

import org.arvinw.example12_3.Internet;
import org.arvinw.example12_3.Modem;

public class RouterProxy implements Internet{

    private Internet modem;

    public RouterProxy() throws Exception {
        this.modem = new Modem("123456");
    }


    @Override
    public void httpAccess(String url) {
        modem.httpAccess(url);
    }
}
