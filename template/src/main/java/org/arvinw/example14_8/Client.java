package org.arvinw.example14_8;

/**
 * 客户端
 */
public class Client {

    /**
     *
     * @param args
     * 定义好一系列方法和这些方法的执行顺序，角色有抽象模板，具体模板
     */
    public static void main(String[] args) {
        PM pm = new HRProject();
        pm.kickoff();


    }
}
