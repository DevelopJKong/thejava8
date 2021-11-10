package me.jeongkong.java8to11.lecture06;

public class App {
    public static void main(String[] args) {
        Foo foo = new DefaultFoo("keesun");
        foo.printName();
        foo.printNameUpperCase();

        Foo.printAnything();
    }
}
