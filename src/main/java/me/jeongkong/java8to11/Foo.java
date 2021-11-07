package me.jeongkong.java8to11;

public class Foo {
    public static void main(String[] args) {
        //void 반환값이 없을때
        //두줄일때는 {}
        //RunSomething runSomething = () -> System.out.println("Hello");
        /*
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        }
        */
        
        //반환값이 있을때
        RunSomething runSomething = (number) -> {
            return number + 10;
        };

        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));
        System.out.println(runSomething.doIt(1));
        
        
    }
}
