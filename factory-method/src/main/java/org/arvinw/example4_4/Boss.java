package org.arvinw.example4_4;

import org.arvinw.example4_3.Enemy;
/**
 * 具体产品B
 */
public class Boss extends Enemy {
    public Boss(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("Boss出现的位置");
        System.out.println("攻击玩家的boss");
    }
}
