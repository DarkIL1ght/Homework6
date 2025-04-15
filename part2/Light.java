package part2;

public class Light {
    private boolean isOn = false;

    public void turnOn() {
        if (!isOn) {
            isOn = true;
            System.out.println("[Свет] Включён");
        }
    }

    public void turnOff() {
        if (isOn) {
            isOn = false;
            System.out.println("[Свет] Выключен");
        }
    }
}