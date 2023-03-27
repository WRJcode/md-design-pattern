package org.arvinw.jdk_Collection;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        Collection<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        Iterator<Integer> itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        list = new LinkedList<>();
        list.add(1);
        list.add(7);
        list.add(9);
        itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Collection<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(5);
        set.add(8);
        itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        set = new TreeSet<>();
        set.add(1);
        set.add(5);
        set.add(5);
        set.add(8);
        itr = set.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
