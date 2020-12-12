package com.github.curriculeon;

public class MainApplication {
    public static void main(String[] args) {
        Person person = new Person(0L, "Peter", 27);
        System.out.println(person.json());

    }
}
