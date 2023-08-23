package org.arvinw.example6;

/*
 抽象构造者
 */
public interface Builder {
    public void buildBasement();

    public void buildWall();

    public void buildRoof();

    public Building getBuilding();
}
