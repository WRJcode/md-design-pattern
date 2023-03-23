package org.arvinw.example3_3_Cell;

public class EnemyPlaneFactory {

    private static EnemyPlane protoType = new EnemyPlane(200);

    private EnemyPlaneFactory(){};

    public static EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        EnemyPlane clone = protoType.clone();
        clone.setX(x);
        return clone;
    }
}
