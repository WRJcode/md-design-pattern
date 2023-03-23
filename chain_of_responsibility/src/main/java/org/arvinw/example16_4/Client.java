package org.arvinw.example16_4;

public class Client {

    /**
     *
     * @param args
     * 责任链模式：类似场景Servlet中Filter链
     */
    public static void main(String[] args) {

        Approver flightJohn = new Staff("张飞");
        flightJohn.setNextApprover(new Manager("关羽")).setNextApprover(new CFO("刘备"));

        flightJohn.approve(1000);

        flightJohn.approve(4000);

        flightJohn.approve(9000);

        flightJohn.approve(88000);
    }
}
