package me.jeongkong.java8to11.lecture10;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class App {
    public static void main(String[] args) {
        List<OnlineClass> springClasses = new ArrayList<>();
        springClasses.add(new OnlineClass(1,"spring boot",true));
        springClasses.add(new OnlineClass(2,"spring data type",true));
        springClasses.add(new OnlineClass(1,"spring mvc",false));
        springClasses.add(new OnlineClass(1,"spring core",false));
        springClasses.add(new OnlineClass(1,"rest api developmen",false));

        OnlineClass spring_boot = new OnlineClass(1, "spring boot", true);

        Optional<Progress> progress = spring_boot.getProgress();


    }
}
