package com.sample;

public class SampleClass {
    private String name;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void display(){
        System.out.println(name);
    }
    public String doSmtng(String name){
        String greeting = null;
        greeting = "Hello" + name;
        return greeting;
    }
}
