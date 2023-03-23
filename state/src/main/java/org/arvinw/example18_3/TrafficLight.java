package org.arvinw.example18_3;

public class TrafficLight {

    String state = "红";

    public void switchToGreen(){
        if ("绿".equals(state)){
            System.out.println("ERROR!!!已是绿灯状态无须再切换");
        } else if ("红".equals(state)) {
            System.out.println("ERROR!!!!红灯不能切换为绿灯");
        } else if ("黄".equals(state)) {
            state = "绿";
            System.out.println("OK..........绿灯亮起60秒");
        }
    }

    public void switchToYellow(){
        if ("黄".equals(state)){
            System.out.println("ERROR!!!已是黄灯状态无须再切换");
        } else if ("红".equals(state)||"绿".equals(state)) {
            state = "黄";
            System.out.println("OK.....黄灯亮5秒");
        }
    }

    public void switchToRed(){
        if ("红".equals(state)){
            System.out.println("ERROR!!!已是红灯状态无须再切换");
        } else if ("绿".equals(state)) {
            System.out.println("ERROR!!!!绿灯不能切换为红灯");
        } else if ("黄".equals(state)) {
            state = "红";
            System.out.println("OK..........红灯亮起60秒");
        }
    }
}
