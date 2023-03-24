package org.arvinw.example4_4;

import org.arvinw.example4_3.Enemy;

/**
 * 具体工厂
 */
public class BossFactory implements Factory{
    @Override
    public Enemy create(int screenWidth) {
        return new Boss(screenWidth/2,0);
    }
}
