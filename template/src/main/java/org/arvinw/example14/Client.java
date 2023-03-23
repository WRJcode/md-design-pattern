package org.arvinw.example14;

public class Client {

    public static void main(String[] args) {
        Mammal mammal = new Bat();
        mammal.live();

        mammal = new Whale1();
        mammal.live();

        mammal = new Human1();
        mammal.live();
    }
}
