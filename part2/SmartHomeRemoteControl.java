package part2;

import java.util.HashMap;
import java.util.Stack;

public class SmartHomeRemoteControl {
    private HashMap<String, Command> commands = new HashMap<>();
    private Stack<Command> history = new Stack<>();

    public void assignCommand(String slot, Command command) {
        commands.put(slot, command);
    }

    public void pressButton(String slot) {
        Command command = commands.get(slot);
        if (command != null) {
            command.execute();
            history.push(command);
        }
    }

    public void undoButton() {
        if (!history.isEmpty()) {
            Command lastCommand = history.pop();
            lastCommand.undo();
        }
    }
}