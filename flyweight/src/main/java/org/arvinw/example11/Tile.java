package org.arvinw.example11;

public class Tile implements Drawable {

    private String image;
    private int x,y;

    public Tile(String image){
        this.image = image;
        System.out.println("从磁盘加载["+image+"]图片，耗时两秒半....");
    }

    public Tile(String image,int x,int y){

        this.image = image;

        System.out.print("从磁盘加载["+image+"]图片，耗时两秒半....");
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("在位置[" + x + ":" + y + "]上绘制图片：[" + image + "]");
    }
}
