package me.jeongkong.java8to11;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Foo3 {
    public static void main(String[] args) {
        
        //Consumer 같은경우에는 그냥 값을 내보내줄 뿐 받아오진 않는다
        Consumer<Integer> printT = (i) -> System.out.println(i);
        //printT.apply(10);
        
        
        //Supplier 같은경우에는 그냥 값을 받아올뿐 내보내진 않는다 무조건 인자를 return 한다 파라미터(x)
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());

        //Predicate 같은경우에는 어떤 인자를 받아서 boolean 타입으로 반환한다
        //Predicate<String> startsWithJeongkong = (s) -> s.startWith("jeongkong"); //startWith?
        Predicate<Integer> isEven = (i) -> i%2 == 0;

//        startsWithJeongkong.or();
//        startsWithJeongkong.and();
//        startsWithJeongkong.negate();



    }
}
