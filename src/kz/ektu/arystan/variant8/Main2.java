package kz.ektu.arystan.variant8;
import java.time.LocalDate;
public class Main2 {
    public static void main(String[] args) {
        BankTransactionService service = new BankTransactionServiceImpl();

        try {
            service.addTransaction(new BankTransaction("T1", "ACC123", "Пополнение", 50000,
                    LocalDate.of(2025, 10, 10), "Пополнение счета", true));

            service.addTransaction(new BankTransaction("T2", "ACC123", "Снятие", 20000,
                    LocalDate.of(2025, 10, 12), "Оплата покупок", true));

            service.addTransaction(new BankTransaction("T3", "ACC456", "Перевод", 100000,
                    LocalDate.of(2025, 10, 14), "Перевод Бекзату", true));

            // Отмена одной транзакции
            service.cancelTransaction("T2");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nВсе транзакции:");
        service.printAllTransactions();

        System.out.println("\nТранзакции типа 'Пополнение':");
        service.searchByTransactionType("Пополнение").forEach(System.out::println);

        System.out.println("\nФильтр по дате 09.10.2025 - 13.10.2025:");
        service.filterTransactionsByDate(LocalDate.of(2025,10,9), LocalDate.of(2025,10,13)).forEach(System.out::println);

        System.out.println("\nСтатистика по суммам:");
        service.getAmountStatistics().forEach((k,v) -> System.out.println(k + ": " + v + " ₸"));
    }
}
