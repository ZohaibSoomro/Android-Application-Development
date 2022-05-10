package week4;

public class ClassAndObjects {
    public static void main(String[] args) {
        TV tv = new TV();
//        System.out.println("Tv is " + tv.isOn);
//        tv.onOff();
//        System.out.println("Tv is " + tv.isOn);
//        System.out.println("Volume is " + tv.sound);
//        tv.volumeUp();
//        System.out.println("Volume is " + tv.sound);

//        System.out.println(tv.isOn);
//        tv.onOff();
//        System.out.println(tv.isOn);
        tv.onOff();
        System.out.println(tv.isOn);
        System.out.println("Channel is: "+tv.channel);
        tv.channelUp();
        tv.channelUp();
        tv.channelUp();
        System.out.println("Channel is: "+tv.channel);
        tv.changeChannel(45);
        System.out.println("Channel is: "+tv.channel);


    }
}

class TV {
    String color;
    int channel, sound;
    double size;
    boolean isOn;

    public void channelUp() {
        if (isOn ) {
            channel++;
        }
    }
    public void channelDown() {
        if (isOn) {
            channel--;
        }
    }

    public void volumeUp() {
        if (isOn && sound < 100) {
            sound++;
        } else {
            System.out.println("Please turn on tv first.");
        }

    }

    public void volumeDown() {
        if (isOn && sound > 0) {
            sound--;
        } else {
            System.out.println("Please turn on tv first.");
        }

    }

    public void onOff() {
        isOn = !isOn;
    }

    public void changeChannel(int channel) {
        if(channel<100){
            this.channel+=channel;
        }
    }
}
