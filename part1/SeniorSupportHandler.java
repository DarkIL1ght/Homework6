package part1;

public class SeniorSupportHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if ("account_ban".equals(issue) || "data_loss".equals(issue)) {
            System.out.println("[Senior] Обработан запрос: " + issue);
        } else {
            System.out.println("[Senior] Не могу обработать '" + issue + "'. Требуется ручное вмешательство.");
        }
    }
}