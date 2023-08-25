package org.arvinw.example4_4;
import org.arvinw.example4_3.Enemy;

/**
 *  抽象工厂
 */
public interface Factory {
    Enemy create (int screenWidth);
}
