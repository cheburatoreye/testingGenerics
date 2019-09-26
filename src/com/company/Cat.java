package com.company;

public class Cat {
    String name;
    Integer yearold=1;

    public Cat(String name) {
        this.name = name;
        this.yearold=yearold++;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", yearold=" + yearold +
                '}';
    }
}
