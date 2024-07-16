package lab_1;

public class device {
    boolean PoweredOn;
    
    public void display_d() {
        System.out.println("this is device class");
    }

    public void powerOn() {
        if (!PoweredOn) {
            PoweredOn = true;
            System.out.println( "now powere is on.");
        } else {
            System.out.println("power is already on.");
        }
    }
    public void powerOff() {
        if (PoweredOn) {
            PoweredOn = false;
            System.out.println("now powere is off.");
        } else {
            System.out.println("power is already off.");
        }
    }
}
