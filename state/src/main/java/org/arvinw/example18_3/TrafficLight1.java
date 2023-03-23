package org.arvinw.example18_3;

public class TrafficLight1 {
    State state = new Red();

    public void setState(State state){
        this.state = state;
    }

    public void switchToGreen(){
        state.switchToGreen(this);
    }

    public void switchToYellow(){
        state.switchToYellow(this);
    }

    public void switchToRed(){
        state.switchToRed(this);
    }
}
