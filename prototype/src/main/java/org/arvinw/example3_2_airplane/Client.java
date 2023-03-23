package org.arvinw.example3_2_airplane;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Client {

    public static void main(String[] args) {
//        List<EnemyPlane> enemyPlaneList = new ArrayList<>();
//
//        for (int i = 0;i<500;i++){
//            EnemyPlane ep = new EnemyPlane(new Random().nextInt(200));
//            enemyPlaneList.add(ep);
//        }
//        for (int i = 0;i<500;i++){
//            System.out.println(enemyPlaneList.get(i));
//        }

        EnemyPlane ep = new EnemyPlane(new Random().nextInt(200));
        System.out.println(ep);
//        System.out.println(ep.clone()); //报错
    }
}
