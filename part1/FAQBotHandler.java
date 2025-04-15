package part1;

public class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if ("password_reset".equals(issue)) {
            System.out.println("[FAQBot] Обработан запрос: " + issue);
        } else {
            if (nextHandler != null) {
                nextHandler.handle(issue); // Передача следующему обработчику
            } else {
                System.out.println("[FAQBot] Не могу обработать '" + issue + "'. Требуется эскалация.");
            }
        }
    }
}