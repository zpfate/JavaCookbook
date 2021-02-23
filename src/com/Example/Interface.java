package com.Example;

interface Person {
    default void run() {
        System.out.println(getName() + "run");
    }

    String getName();
}

class Student implements Person {
    private String name;

    @Override
    public void run() {
        System.out.println(this.name + "run");
    }

    @Override
    public String getName() {
        return this.name;
    }



}
