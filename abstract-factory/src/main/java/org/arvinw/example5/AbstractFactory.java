package org.arvinw.example5;

public interface AbstractFactory {

    LowClassUnit createLowClass();

    MidClassUnit createMidClass();

    HighClassUnit createHighClass();
}
