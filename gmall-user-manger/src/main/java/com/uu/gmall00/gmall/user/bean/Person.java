package com.uu.gmall00.gmall.user.bean;

public class Person {

    String name;
    Integer age;

    public Person(){}


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
