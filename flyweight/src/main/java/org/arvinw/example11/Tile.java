package org.arvinw.example11;

public class Tile {

    private String image;
    private int x,y;

    public Tile(String image,int x,int y){

        this.image = image;

        System.out.print("从磁盘加载["+image+"]图片，耗时两秒半....");
        this.x = x;
        this.y = y;
    }

    public void draw(){
        System.out.println("在位置[" + x + ":" + y + "]上绘制图片：[" + image + "]");
    }
}
