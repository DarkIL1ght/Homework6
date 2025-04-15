import part1.*;
import part2.*;
public class Main {
    public static void main(String[] args) {

        SupportHandler faq = new FAQBotHandler();
        SupportHandler junior = new JuniorSupportHandler();
        SupportHandler senior = new SeniorSupportHandler();

        faq.setNext(junior).setNext(senior);

        String[] issues = {"password_reset", "refund_request", "account_ban", "unknown_bug"};
        for (String issue : issues) {
            faq.handle(issue);
        }
        //===============================================

        Light light = new Light();
        Thermostat thermostat = new Thermostat();

        Command turnOnLight = new TurnOnLightCommand(light);
        Command setThermo = new SetThermostatCommand(thermostat, 22);


        SmartHomeRemoteControl remote = new SmartHomeRemoteControl();
        remote.assignCommand("A", turnOnLight);
        remote.assignCommand("B", setThermo);


        remote.pressButton("A");
        remote.pressButton("B");
        remote.undoButton();
    }
}