package com.company;

public class Girl {
    String name;
    int age;

    public Girl(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void goToCinema() {
        System.out.println("Yes");  }

    public String goToRest(String rest) {
        if (rest.equals("Mac")) {
            return "No";
        } else {
            return "Yes";
        }
    }

    public String gift(String gift) {
        if (gift.equals("Rabbit")) {
            return "Love my love say - " + name;
        } else {
            return "Angry say - " + name;
        }
    }
}
