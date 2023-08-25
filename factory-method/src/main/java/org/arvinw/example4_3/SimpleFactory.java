package org.arvinw.example4_3;

import java.util.Random;
/**
 * 
 * @author wrjco
 * 工厂类
 *
 */
public class SimpleFactory {

    private int screenWidth;
    private Random random;

    public SimpleFactory(int screenWidth){
        this.screenWidth = screenWidth;
        this.random = new Random();
    }

    public Enemy create(String type){
        int x = random.nextInt(screenWidth);
        Enemy enemy = null;

        switch (type){
            case "Airplane":
                enemy = new Airplane(x,0);
                break;
            case "Tank":
                enemy = new Tank(x,0);
                break;
        }
        return enemy;
    }
}
