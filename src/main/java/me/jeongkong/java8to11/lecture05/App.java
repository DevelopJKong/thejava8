package me.jeongkong.java8to11.lecture05;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        //Function<Integer, String> intToString = (i) -> "number";

        //UnaryOperator<String> hi = (s) -> hi + s;
        UnaryOperator<String> hi = Greeting::hi;

        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello; //왜 나는 에러가 나는거지? App에 생성자를 제대로 안 만들어줘서 에러가 발생

        Function<String, Greeting> jeongkongGreeting = Greeting::new;

        Supplier<Greeting> newGreeting = Greeting::new;

        String[] names = {"keesun","whiteship","toby"};
        Arrays.sort(names, new Comparator<String>(){
            @Override
            public int compare(String o1,String o2) {
                return 0;
            }
        });
        //임의 인스턴스 객체를 참조하는 방법 5강 마지막부분 확인요망
        Arrays.sort(names, String::compareToIgnoreCase);

    }
}
