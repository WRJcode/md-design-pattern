package org.arvinw.example15;

import java.util.ArrayList;
import java.util.List;

public class Client1 {

    /**
     *
     *@param args
     * 迭代器模式:行为型模式，
     * 本例子分析：Iterable接口，有返回一个迭代器接口Iterator；迭代器Iterator接口有hasNext()判断是否有
     * 下一个元素，next()返回下一个元素，迭代器实现功能；迭代器实现类在DrivingRecorder内部类Itr，实现hasNext()和next()方法
     */

    public static void main(String[] args) {

        DrivingRecorder dr = new DrivingRecorder();

        for (int i = 0;i < 12 ; i++){
            dr.append("视频_" + i);
        }

        List<String> uStorage = new ArrayList<>();

        Iterator<String> it = dr.iterator();

        while (it.hasNext()){
            String video = it.next();
            System.out.println(video);
            if ("视频_10".equals(video)||"视频_8".equals(video)){
                uStorage.add(video);
            }
        }
        System.out.println("事故证据：" + uStorage);
    }
}
