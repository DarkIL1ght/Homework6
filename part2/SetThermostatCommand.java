package part2;

public class SetThermostatCommand implements Command {
    private Thermostat thermostat;
    private int targetTemp;
    private int previousTemp;

    public SetThermostatCommand(Thermostat thermostat, int targetTemp) {
        this.thermostat = thermostat;
        this.targetTemp = targetTemp;
    }

    @Override
    public void execute() {
        previousTemp = thermostat.getCurrentTemperature();
        thermostat.setTemperature(targetTemp);
    }

    @Override
    public void undo() {
        thermostat.setTemperature(previousTemp);
    }
}