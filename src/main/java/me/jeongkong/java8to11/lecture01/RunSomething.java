package me.jeongkong.java8to11.lecture01;

@FunctionalInterface
//이렇게 애노테이션을 사용해주면 컴파일시 에러가 발생하게 된다
public interface RunSomething {
    /*****************반환값이 없을때*******************/
    //추상 메소드가 딱 하나만 있으면 함수형 인터페이스이다 abstract가 생략되어 있다
    //void doIt();
    //만약에 추상 메소드가 두개가 있으면 아니다
    //void doItAgain();

    /****************반환값이 있을때******************/
    int doIt(int number);
    
    
    //static 이 있더라도 함수형 인터페이스이다 무조건 추상메소드가 하나만 있어야 한다
    static void printName() {
        System.out.println("Keesun");
    }

    default void printAge() {
        System.out.println("40");
    }
}
