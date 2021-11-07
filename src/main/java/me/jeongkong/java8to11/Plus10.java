package me.jeongkong.java8to11;

public class Plus10 implements Function<Integer, Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer + 10;
    }
}
