package part2;

public class Thermostat {
    private int temperature = 20;

    public void setTemperature(int temp) {
        System.out.println("[Термостат] Установлена температура: " + temp + "°C");
        temperature = temp;
    }

    public int getCurrentTemperature() {
        return temperature;
    }
}