package com.example.fullscreen.core.model;

public class ExampleModel {

    private String name;
    private int num;

    public ExampleModel(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
