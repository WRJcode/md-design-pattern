package org.arvinw.example11;

import java.util.HashMap;
import java.util.Map;

public class TileFactory {

    private Map<String,Drawable> images;

    public TileFactory(){
        images = new HashMap<String,Drawable>();
    }

    public Drawable getDrawable(String image){
        if (!images.containsKey(image)){
            switch (image){
                case "河流":
                    images.put(image,new River());
                    break;
                case "草地":
                    images.put(image,new Grass());
                    break;
                case "道路":
                    images.put(image,new Road());
                    break;
                case "房屋":
                    images.put(image,new House());
                default:
                    images.put(image, new Tile(image));
            }
        }
        return images.get(image);
    }
}
