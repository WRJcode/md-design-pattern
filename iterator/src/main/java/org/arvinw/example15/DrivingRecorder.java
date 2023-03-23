package org.arvinw.example15;

public class DrivingRecorder implements Iterable<String> {

    private int index = -1;
    private String[] records = new String[10];

    public void append(String record){
        if (index == 9){
            index =  0;
        } else {
            index ++;
        }
        records[index] = record;
    }

    public void display(){
        for (int i = 0;i < 10;i++){
            System.out.println(i + ":" + records[i]);
        }
    }

    public void displayByOrder(){
        for (int i = index,loopCount = 0;loopCount < 10;i = i == 0?i=9 : i - 1,loopCount++){
            System.out.println(records[i]);
        }
    }


    @Override
    public Iterator<String> iterator() {
        return  new Itr();
    }

    private class Itr implements Iterator<String>{

        int cursor = index;
        int loopCount = 0;

        @Override
        public String next() {
            int i = cursor;
            if (cursor == 0){
                cursor = 9;
            } else {
                cursor--;
            }
            loopCount++;
            return records[i];
        }

        @Override
        public boolean hasNext() {
            return loopCount < 10;
        }
    }
}
