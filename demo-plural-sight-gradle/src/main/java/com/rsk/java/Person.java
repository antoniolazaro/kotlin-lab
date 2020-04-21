package com.rsk.java;

import org.jetbrains.annotations.Nullable;

public class Person {

    private String name;
    private int age;
    private Person partner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name == null || name.equals("")) throw new IllegalArgumentException("name invalid");
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPartner(Person partner) {
        this.partner = partner;
    }

    @Nullable
    public Person getPartner() {
        return partner;
    }
}
