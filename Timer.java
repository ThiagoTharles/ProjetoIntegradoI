import java.util.Date;

public class Timer {
    private Clock allocatedTime;
    private Date date;
    private int pomodoro;
    private  boolean isPaused = true;
    private int shortBreak;
    private int longBreak;

    public Timer(int shortBreak, int longBreak) {
        this.shortBreak = shortBreak;
        this.longBreak = longBreak;
    }
    public Timer() {
    }

    public Clock getAllocatedTime() {
        return allocatedTime;
    }
    public void setAllocatedTime(Clock allocatedTime) {
        this.allocatedTime = allocatedTime;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getPomodoro() {
        return pomodoro;
    }
    public void setPomodoro(int pomodoro) {
        this.pomodoro = pomodoro;
    }
    public int getShortBreak() {
        return shortBreak;
    }
    public void setShortBreak(int shortBreak) {
        this.shortBreak = shortBreak;
    }
    public int getLongBreak() {
        return longBreak;
    }
    public void setLongBreak(int longBreak) {
        this.longBreak = longBreak;
    }
    public boolean isPaused() {
        return isPaused;
    }
    public void setPaused(boolean isPaused) {
        this.isPaused = isPaused;
    }

    public void start() {
        isPaused = false;
    }
    public void stop() {
        isPaused = true;
    }
    public void pause() {
        isPaused = true;
    }

}
