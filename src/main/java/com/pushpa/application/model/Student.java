package com.pushpa.application.model;


import java.util.UUID;

public class Student {
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    UUID id;

    public Student(UUID id,String name, String address) {
        this.id=id;
        this.name = name;
        this.address = address;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    String address;
}
