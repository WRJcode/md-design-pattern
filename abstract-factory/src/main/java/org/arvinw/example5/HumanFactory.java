package org.arvinw.example5;

/**
 * 
 * @author wrjco
 * 具体产品
 *
 */
public class HumanFactory implements AbstractFactory{

    private int x;
    private int y;

    public HumanFactory(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit createLowClass() {
        LowClassUnit unit = new Marine(x,y);
        System.out.println("marine made successfully!");
        return unit;
    }

    @Override
    public MidClassUnit createMidClass() {
        MidClassUnit unit = new Tank(x,y);
        System.out.println("tank made successfully!");
        return unit;
    }

    @Override
    public HighClassUnit createHighClass() {
        HighClassUnit unit = new Battleship(x,y);
        System.out.println("battleship made successfully!");
        return unit;
    }
}
