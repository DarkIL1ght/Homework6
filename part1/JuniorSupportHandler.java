package part1;

public class JuniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if ("refund_request".equals(issue) || "billing_issue".equals(issue)) {
            System.out.println("[Junior] Обработан запрос: " + issue);
        } else {
            if (nextHandler != null) {
                nextHandler.handle(issue);
            } else {
                System.out.println("[Junior] Не могу обработать '" + issue + "'. Требуется эскалация.");
            }
        }
    }
}