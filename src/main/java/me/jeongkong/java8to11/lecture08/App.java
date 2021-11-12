package me.jeongkong.java8to11.lecture08;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("jeongbin");
        names.add("whiteship");
        names.add("toby");
        names.add("foo");

//        for ( String name : names ){
//            if(name.startsWith("k")) {
//                System.out.println(name.toUpperCase());
//            }
//        }


        //Stream<String> stringStream = names.stream().map(String::toUpperCase);
        //종료 스트림을 사용하지 않으면 적용이 되지 않는다 그저 정의한 한것이자 강의 그림 참조

        List<String> collect = names.stream().map( (s) -> {
            System.out.println(s);
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);

        
        System.out.println("===========================");
        names.forEach(System.out::println);
        
        //정확하게 병렬적으로 처리 된다가 어떤 그림인거지? 확실하게 모르겠다
        //병렬적 처리가 유용한 경우는 정말 방대한 량의 데이터를 사용할때 유용하다
        //그렇지 않은 경우에는 stream() 을 사용해도? 무방하다
        List<String> collect2 = names.parallelStream().map(String :: toUpperCase)
                .collect(Collectors.toList());
        collect2.forEach(System.out::println);
        
        List<String> collect3 = names.parallelStream().map((s)-> {
            System.out.println(s+ " " + Thread.currentThread().getName());
            return s.toUpperCase();
        }).collect(Collectors.toList());
        collect3.forEach(System.out::println);




    }
}
