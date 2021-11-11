package me.jeongkong.java8to11.lecture07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Spliterator;

public class App {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Keesun");
        name.add("whiteship");
        name.add("toby");
        name.add("foo");

        /*************forEach****************/
        /************반복을 할때****************/
        //여기에 들어오는것은 consumer 가 들어온다
        //name.forEach(s -> {
        //      System.out.println(s);
        //});

        name.forEach(System.out::println);


        /****************Spliterator****************/
        /****************쪼개서 나열하고 싶을때*************************/
        Spliterator<String> spliterator = name.spliterator();
        Spliterator<String> spliterator1 = spliterator.trySplit();
        while (spliterator.tryAdvance(System.out::println));
        System.out.println("=====================");
        while (spliterator1.tryAdvance(System.out::println));

        /*****************removeIf*****************/
        /*****************삭제할때************/
        name.removeIf(s-> s.startsWith("K"));

        /****************Comparator*********************/
        /*****************정렬을 할때****************/
        Comparator<String> compareToIgnoreCase = String::compareToIgnoreCase;
        name.sort(compareToIgnoreCase.reversed().thenComparing(compareToIgnoreCase)); //reversed 다음에 더 정렬을 하고 싶을때



    }
}
