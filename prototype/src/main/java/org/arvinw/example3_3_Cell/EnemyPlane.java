package org.arvinw.example3_3_Cell;

public class EnemyPlane implements Cloneable{

    private int x;

    private int y;

    public EnemyPlane(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public int getX(){
        return x;
    }

    public void fly(){
        y++;
    }

    @Override
    public String toString() {
        return "EnemyPlane{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

    public void setX(int x){
        this.x = x;
    }

    @Override
    protected EnemyPlane clone() throws CloneNotSupportedException {
        return (EnemyPlane)super.clone();
    }
}
