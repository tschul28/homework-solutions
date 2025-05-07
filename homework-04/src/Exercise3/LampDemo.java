package Exercise3;

public class LampDemo {

    public static void main(String[] args) {
        Lamp l = new Lamp();

        l.turnOn();
        l.setBrightness(42);
        l.dimToHlf();
        System.out.println(l.getBrightness());
    }

}
