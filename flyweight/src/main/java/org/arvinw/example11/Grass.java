package org.arvinw.example11;

public class Grass implements Drawable{

    private String image;

    public Grass(){
        this.image = "草地";
        System.out.println("从磁盘加载[" + image + "]图片，耗时两秒半....");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("在位置[" + x + ":" + y + "]上绘制图片：[" + image + "]");
    }
}
