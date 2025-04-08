package chapter07.access;

//접근 제어자를 통해 클래스를 캡슐화 할 수 있다.
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (!(0 <= hour && hour <= 24)) {
            return;
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (!(0 <= minute && minute <= 60)) {
            return;
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (!(0 <= second && second <= 60)) {
            return;
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }

    public static void main(String[] args) {
        Time t = new Time(12, 35, 30);
        System.out.println(t);
        //t.hour //데이터에 직접 접근하는 것을 막는다.
        t.setHour(t.getHour() + 1);
        System.out.println(t);
    }

}
