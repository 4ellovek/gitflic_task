package kz.ektu.arystan.variant8;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
public class BankTransactionServiceImpl implements BankTransactionService {
    private Map<String, BankTransaction> transactionMap = new HashMap<>();

    public boolean addTransaction(BankTransaction transaction) throws IllegalArgumentException {
        if (transaction == null)
            throw new IllegalArgumentException("Ошибка: транзакция не может быть null");

        if (transaction.getTransactionId() == null || transaction.getTransactionId().isBlank())
            throw new IllegalArgumentException("Ошибка: ID транзакции пустой");

        if (transactionMap.containsKey(transaction.getTransactionId()))
            throw new IllegalArgumentException("Ошибка: транзакция с таким ID уже существует");

        if (transaction.getAmount() <= 0)
            throw new IllegalArgumentException("Ошибка: сумма должна быть больше нуля");

        transactionMap.put(transaction.getTransactionId(), transaction);
        return true;
    }
    public boolean cancelTransaction(String transactionId) throws Exception {
        if (transactionId == null || transactionId.isBlank())
            throw new IllegalArgumentException("Ошибка: ID не должен быть пустым");

        BankTransaction transaction = transactionMap.get(transactionId);
        if (transaction == null)
            throw new Exception("Ошибка: транзакция с ID " + transactionId + " не найдена");

        transaction.setCompleted(false);
        return true;
    }

    public List<BankTransaction> searchByTransactionType(String transactionType) {
        if (transactionType == null || transactionType.isBlank()) return new ArrayList<>();

        return transactionMap.values().stream()
                .filter(t -> transactionType.equalsIgnoreCase(t.getTransactionType()))
                .collect(Collectors.toList());
    }
    public Map<String, Double> getAmountStatistics() {
        Map<String, Double> stats = new HashMap<>();
        for (BankTransaction t : transactionMap.values()) {
            stats.merge(t.getTransactionType(), t.getAmount(), Double::sum);
        }
        return stats;
    }
    public List<BankTransaction> filterTransactionsByDate(LocalDate fromDate, LocalDate toDate) {
        if (fromDate == null || toDate == null) return new ArrayList<>();

        return transactionMap.values().stream()
                .filter(t -> (t.getTransactionDate().isEqual(fromDate) || t.getTransactionDate().isAfter(fromDate)) &&
                        (t.getTransactionDate().isEqual(toDate) || t.getTransactionDate().isBefore(toDate)))
                .sorted(Comparator.comparing(BankTransaction::getTransactionDate).reversed())
                .collect(Collectors.toList());
    }

    public void printAllTransactions() {
        if (transactionMap.isEmpty()) {
            System.out.println("Список транзакций пуст.");
            return;
        }
        transactionMap.values().forEach(System.out::println);
    }
}
