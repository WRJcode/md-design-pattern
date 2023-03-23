package org.arvinw.example4_4;

import org.arvinw.example4_3.Enemy;
import org.arvinw.example4_3.Tank;

import java.util.Random;

public class TankFactory implements Factory{

    @Override
    public Enemy create(int screenWidth) {
        Random random = new Random(screenWidth);
        return new Tank(random.nextInt(screenWidth), 0);
    }
}
