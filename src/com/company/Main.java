package com.company;

public class Main {

    public static void main(String[] args) {
        Girl girl = new Girl("Ira", 20);
        System.out.println(girl);
        Girl girl1 = new Girl("Mira", 22);
        System.out.println(girl1);
        System.out.println(girl1.name);
        System.out.println(girl.age);
        girl.goToCinema();
        System.out.println(girl.goToRest("Mac"));
        System.out.println(girl1.goToRest("Culinichi"));
        System.out.println(girl.gift("Rabbit"));
        Man man = new Man("Sam", 22);
        System.out.println(man);
        System.out.println(man.age);
        System.out.println(man.name);
        man.goToDrink();
        man.goToWoman("Woman");

    }
}
