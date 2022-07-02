package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name;
    private int age;
    private int weight;
    private int heightCm;
    private boolean isMarried;

    public Person() {
        name = "";
        age = Integer.MAX_VALUE;
    }

    public Person(int age) {
        name = "";
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
        this.age = Integer.MAX_VALUE;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int heightCm, int weight, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.heightCm = heightCm;
        this.weight = weight;
        this.isMarried = isMarried;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setHeightCm(int height) {
        heightCm = height;
    }

    public int getHeight() {
        return heightCm;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean getMarital() {
        return isMarried;
    }

    public void setMarital(boolean isMarried) {
        this.isMarried = isMarried;
    }
}
