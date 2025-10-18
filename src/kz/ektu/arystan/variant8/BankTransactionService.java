package kz.ektu.arystan.variant8;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
public interface BankTransactionService {
    boolean addTransaction(BankTransaction transaction) throws IllegalArgumentException;
    boolean cancelTransaction(String transactionId) throws Exception;
    List<BankTransaction> searchByTransactionType(String transactionType);
    Map<String, Double> getAmountStatistics();
    List<BankTransaction> filterTransactionsByDate(LocalDate fromDate, LocalDate toDate);
    void printAllTransactions();
}

