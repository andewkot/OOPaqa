package com.company;

public class Man {
    String name;
    int age;

    public Man(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Man{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void goToDrink() {
        System.out.println("Go Bratish!");
    }

    public void goToWoman(String woman) {
        System.out.println("Go my friend!");
    }
}
