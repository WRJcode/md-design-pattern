package org.arvinw.example17;

public class Subtraction implements Strategy{
    @Override
    public int calculate(int a, int b) {
        return a - b;
    }
}
