package org.arvinw.example4_3;

import java.util.Random;

public class Client_no_factory {

    public static void main(String[] args) {
        int screenWidth = 100 ;
        System.out.println("游戏开始");
        Random random = new Random();

        int x = random.nextInt(screenWidth);
        Enemy airplane = new Airplane(x,0);
        airplane.show();

        x = random.nextInt(screenWidth);
        Enemy tank = new Tank(x,0);
        tank.show();
    }
}
