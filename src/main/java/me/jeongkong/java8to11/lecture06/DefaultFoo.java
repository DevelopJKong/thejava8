package me.jeongkong.java8to11.lecture06;

import java.util.Locale;

public class DefaultFoo implements Foo,Bar{

    String name;

    public DefaultFoo(String name) {
        this.name = name;
    }

    @Override
    public void printNameUpperCase() {
        System.out.println(this.name.toUpperCase());
    }

    @Override
    public void printName() {
        System.out.println("DefaultFoo");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
