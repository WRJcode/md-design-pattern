package org.arvinw.example6;

public class Director {

    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public Building direct(){
        System.out.println("工程项目启动");
        builder.buildBasement();
        builder.buildWall();
        builder.buildRoof();
        return builder.getBuilding();
    }
}
