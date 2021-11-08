package me.jeongkong.java8to11;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Foo2 {
    public static void main(String[] args) {
        //이렇게 객체를 받아서 사용해도 되지만
        //Plus10 plus10 = new Plus10();
        /**
         * Function<Integer,Integer> plus10 = (i) -> i + 10;
         */
        Function<Integer,Integer> plus10 = (i) -> i + 10;
        Function<Integer,Integer> multiply2 = (i) -> i * 2;
        Function<Integer,Integer> multiply2AndPlus10 = plus10.compose(multiply2);



        //compose는 compose 안에 있는것이 먼저 실행되고 그 다음 앞 함수가 실행된다

        Function<Integer,Integer> Plus10Andmultiply2 = plus10.andThen(multiply2);
        //andThen는 andThen 앞에 있는 함수가 먼저 실행되고 그 다음 안에 있는 함수가 실행된다

        System.out.println(Plus10Andmultiply2.apply(2));


        /**
         * 입력값의 타입과 반환값의 타입이 같을경우에는 UnaryOperater를 사용할수있다
         */

        UnaryOperator<Integer> plus10_ = (i) -> i + 10;
        UnaryOperator<Integer> multiply2_ = (i) -> i * 2;
    }
}
