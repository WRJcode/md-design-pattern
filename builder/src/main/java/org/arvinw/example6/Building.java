package org.arvinw.example6;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<String> buildingComponents = new ArrayList<>();

    public void setBasement(String basement){
        this.buildingComponents.add(basement);
    }

    public void setRoof(String roof){
        this.buildingComponents.add(roof);
    }

    public void setWall(String wall){
        this.buildingComponents.add(wall);
    }

    @Override
    public String toString(){
        String buildingStr = "";
        for (int i = buildingComponents.size() - 1;i >=0;i--){
            buildingStr += buildingComponents.get(i);
        }
        return buildingStr;
    }
}
