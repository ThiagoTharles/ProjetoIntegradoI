package main.java.com.takeiteasy.takeiteasy.modules.clock;

public class Clock {
    int hour = 0;
    int minute = 0;
    int second = 0;

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
