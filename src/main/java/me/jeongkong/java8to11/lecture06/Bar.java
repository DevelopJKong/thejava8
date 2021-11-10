package me.jeongkong.java8to11.lecture06;

public interface Bar extends Foo{
    //Bar에서는 Foo에서 사용하는 Default 메소드를 사용하고 싶지 않다 하면 아래와 같이 사용가능하다
    //void printNameUpperCase();


    @Override
    default void printNameUpperCase() {
        System.out.println("BAR");
    }
}
