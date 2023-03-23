package org.arvinw.example4_4;

import org.arvinw.example4_3.Airplane;
import org.arvinw.example4_3.Enemy;

import java.util.Random;

public class AirplaneFactory implements Factory{

    @Override
    public Enemy create(int screenWidth) {
        Random random = new Random(screenWidth);
        return new Airplane(random.nextInt(screenWidth),0);
    }
}
