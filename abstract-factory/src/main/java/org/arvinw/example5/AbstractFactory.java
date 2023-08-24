package org.arvinw.example5;

/**
 * 
 * @author wrjco
 * 抽象工厂类
 *
 */
public interface AbstractFactory {

    LowClassUnit createLowClass();

    MidClassUnit createMidClass();

    HighClassUnit createHighClass();
}
