package com.uu.gmall00.gmall.user.bean;

public class Person {

    String name;
    Integer age;
    String address;
    String sex;
    int id;
    String hah;

    public Person(){}
    public Person(String hah){}


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
