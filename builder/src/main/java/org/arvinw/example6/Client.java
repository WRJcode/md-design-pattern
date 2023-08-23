package org.arvinw.example6;

/**
 * 调用方
 */
public class Client {

    /**
     *
     * @param args
     * 建造者模式：角色有导演、建筑师、”建筑“；导演用到了建筑师（聚合）；有抽象建筑师和具体建筑师
     */
    public static void main(String[] args) {
        Director director = new Director(new HouseBuilder());
        System.out.println(director.direct());

        director.setBuilder(new ApartmentBuilder());
        System.out.println(director.direct());
    }
}
