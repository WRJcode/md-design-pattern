package org.arvinw.example6;

/**
 * 具体构造者
 */
public class ApartmentBuilder implements Builder{

    private Building apartment;

    public ApartmentBuilder(){
        apartment = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("深挖地基，修建地下车库，部署管道、线缆、风道。");
        apartment.setBasement("|____________________________________________|\n");
    }

    @Override
    public void buildWall() {
        System.out.println("搭建多层建筑框架，建造电梯井，钢筋混凝土浇灌。");
        for (int i = 0;i < 8;i++){
            apartment.setWall("| 口 口 口 口 |\n");
        }
    }

    @Override
    public void buildRoof() {
        System.out.println("封顶，部署通风井，做防水层，保温层。");
        apartment.setRoof("|------------------------------------------------------------|\n");
    }

    @Override
    public Building getBuilding() {
        return apartment;
    }
}
