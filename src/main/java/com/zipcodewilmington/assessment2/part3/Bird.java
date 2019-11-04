package com.zipcodewilmington.assessment2.part3;

public class Bird implements Animal {
    public String move() {
        return "fly";
    }

    @Override
    public int getSpeed() {
        return 13;
    }

    @Override
    public String color() {
        return "blue";
    }

    public void setMigrationMonth(String expected) {

    }

    public String getMigrationMonth() {
        return null;
    }
}
