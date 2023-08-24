package org.arvinw.example5;

/**
 * 
 * @author wrjco
 * 具体工厂类
 *
 */
public class AlienFactory implements AbstractFactory{

    private int x;
    private int y;

    public AlienFactory(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public LowClassUnit createLowClass() {
        LowClassUnit unit = new Roach(x,y);
        System.out.println("roach made successfully!");
        return unit;
    }

    @Override
    public MidClassUnit createMidClass() {
        MidClassUnit unit = new Poison(x,y);
        System.out.println("poison made successfully!");
        return unit;
    }

    @Override
    public HighClassUnit createHighClass() {
        HighClassUnit unit = new Mammoth(x,y);
        System.out.println("mammoth made successfully!");
        return unit;
    }
}
