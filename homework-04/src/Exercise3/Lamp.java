package Exercise3;

public class Lamp implements Switchable, Dimmable {

    private boolean on = false;
    private int brightness = 0;

    @Override
    public void setBrightness(int level) {
        if (!on) {
            return;
        }
        brightness = Math.max(0, Math.min(MAX_BRIGHTNESS, level));
    }

    @Override
    public int getBrightness() {
        return brightness;
    }

    @Override
    public void turnOn() {
        on = true;
    }

    @Override
    public void turnOff() {
        on = false;
    }

    @Override
    public boolean isOn() {
        return on;
    }

}
