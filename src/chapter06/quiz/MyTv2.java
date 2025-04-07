package chapter06.quiz;

public class MyTv2 {
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    private boolean isPowerOn;
    private int channel;
    private int volume;
    private int prevChannel;

    public void goToPrevChannel() {
        int tmp = channel;
        channel = prevChannel;
        prevChannel = tmp;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public int getChannel() {
        return channel;
    }

    public int getVolume() {
        return volume;
    }

    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setChannel(int channel) {
        prevChannel = this.channel;
        this.channel = channel;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public static void main(String[] args) {
        MyTv2 myTv2 = new MyTv2();

        myTv2.setChannel(10);
        System.out.println("CH:" + myTv2.getChannel());
        myTv2.setChannel(20);
        System.out.println("CH:" + myTv2.getChannel());
        myTv2.goToPrevChannel();
        System.out.println("CH:" + myTv2.getChannel());
        myTv2.goToPrevChannel();
        System.out.println("CH:" + myTv2.getChannel());
    }

}
