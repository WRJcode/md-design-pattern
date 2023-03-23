package org.arvinw.example3_2_airplane;

import java.util.Random;

public class EnemyPlane implements Cloneable {

    public static void main(String[] args) throws CloneNotSupportedException {
        EnemyPlane ep = new EnemyPlane(new Random().nextInt(200));
        System.out.println(ep);
        System.out.println(ep.clone());
        //如果不继承Cloneable，会发生报错，虽说里面没有方法，但这是个标记接口，否则报不支持克隆错误
        //注意Object中方法修饰符是protected，外部包的类不能访问
    }

    private int x;

    private int y;

    public EnemyPlane(int x){
        this.x = x;
    }

    @Override
    public String toString() {
        return "EnemyPlane{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public int getY(){
        return y;
    }

    public void fly(){
        y++;
    }

    public static void staticMethod(int i){
        System.out.println("invoke static method！");
    }
}
