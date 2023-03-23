package org.arvinw.example3_3_Cell;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {
    /**
     *
     * @param args
     * @throws CloneNotSupportedException
     * 原型模型：”克隆“,java中利用实现Cloneable接口,这是标记接口并无方法；实际上是调用Object中clone(),修饰符为protected
     */
    public static void main(String[] args) throws CloneNotSupportedException {


        List<EnemyPlane> enemyPlaneList = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            enemyPlaneList.add(EnemyPlaneFactory.getInstance(new Random().nextInt(200)));
        }

        for (int i = 0; i < 500; i++) {
            System.out.println(enemyPlaneList.get(i));
        }
    }
}
