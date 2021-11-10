package me.jeongkong.java8to11.lecture01;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Foo4 {
    public static void main(String[] args) {
        Foo4 foo = new Foo4();
        foo.run();
    }
    public void run() {
        //java 8에서는 final를 생략할수있는 상황이 있다
        //final은 변경할수없는 변수를 말한다
        //사실상 final 일 경우에는 final을 생략할수있다 -> effective final 이라고 한다
        int baseNumber = 10;

        //로컬 클래스
        //쉐도잉이 된다
        class LocalClass {
            void printBaseNumber() {
                int baseNumber = 11;
                System.out.println(baseNumber); //11
            }
        }

        //익명 클래스
        //쉐도잉이 된다
        Consumer<Integer> integerConsumner = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(baseNumber);
            }
        };

        //람다
        //쉐도잉이 안된다 ****************************/
        //스코프가 같다 때문에 쉐도잉이 안되는것이다
        //때문에 같은 변수를 사용할수 없다
        IntConsumer printInt = (i) -> {
            System.out.println(i + baseNumber);
        };

        printInt.accept(10);
    }
}
