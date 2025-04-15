Part 1: Chain of Responsibility
Topic: Behavioral Design Pattern
Title: “Tech Support Request Handler”

Real-World Analogy:
Imagine you send a message to a tech support center. First, a chatbot tries to help you. If it can’t, your issue is escalated to a junior specialist. If they can’t fix it, it goes to a senior engineer. This is a perfect use case for the Chain of Responsibility pattern — each handler decides whether to process the request or pass it forward.

Goal:
Design a system where user issues are passed through a chain of support levels. Each level can either:

Handle the issue itself

Or forward it to the next handler in the chain

Step-by-Step Instructions:
Create an abstract class/interface called SupportHandler:

Define a method set_next(handler)

Define a method handle(issue)

Implement at least 3 concrete handlers:

FAQBotHandler — handles simple issues like “password_reset”

JuniorSupportHandler — handles “refund_request”, “billing_issue”

SeniorSupportHandler — handles “account_ban”, “data_loss”

Build the chain like this:

faq = FAQBotHandler()
junior = JuniorSupportHandler()
senior = SeniorSupportHandler()

faq.set_next(junior).set_next(senior)
Test your system with a list of issues:

issues = ["password_reset", "refund_request", "account_ban", "unknown_bug"]
for issue in issues:
    faq.handle(issue)
Output Example:
[FAQBot] Handled password_reset
[JuniorSupport] Handled refund_request
[SeniorSupport] Handled account_ban
[SeniorSupport] Cannot handle unknown_bug — escalate manually
Bonus:
Add a Logger to track which handler tried what

Implement dynamic handler configuration

Let students explore exception handling when issue goes unresolved

Part 2: Command Pattern
Topic: Behavioral Design Pattern
Title: “Smart Home Remote Control”

Real-World Analogy:
Think of your smartphone as a remote that can control your home. Each button (like "Turn on the lights") doesn’t know how the light works — it just tells a command object what to do. This is the essence of the Command Pattern — decoupling the invoker from the receiver.

Goal:
Create a remote control app that executes commands for smart devices like lights, thermostats, and music players. You’ll use the Command pattern to issue, execute, and even undo actions.

Step-by-Step Instructions:
Create a Command interface/class:

execute()

undo()

Create receivers (devices):

Light, Thermostat, etc.

Create concrete command classes:

TurnOnLightCommand(Light)

SetThermostatCommand(Thermostat, temperature)

Create the Invoker — SmartHomeRemoteControl

Stores a dictionary of command slots

Can call press_button(slot) and undo_button()

Client Code:

Assign commands to slots

Execute and undo actions

Output Example:
[Light] Turning ON
[Thermostat] Setting temperature to 22°C
Undo last command
[Thermostat] Reverting to previous temperature
Bonus:
Implement macro commands (e.g., “Goodnight mode” turns off lights, lowers thermostat, and locks doors)

Add redo functionality

Create a CLI menu for commands
