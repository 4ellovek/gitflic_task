package kz.ektu.arystan.variant8;
import java.time.LocalDate;
public class BankTransaction {
    private String transactionId;
    private String accountNumber;
    private String transactionType;
    private double amount;
    private LocalDate transactionDate;
    private String description;
    private boolean isCompleted;

    public BankTransaction(String transactionId, String accountNumber, String transactionType,
                           double amount, LocalDate transactionDate, String description, boolean isCompleted) {
        this.transactionId = transactionId;
        this.accountNumber = accountNumber;
        this.transactionType = transactionType;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.description = description;
        this.isCompleted = isCompleted;
    }
    public String getTransactionId() { return transactionId; }
    public String getAccountNumber() { return accountNumber; }
    public String getTransactionType() { return transactionType; }
    public double getAmount() { return amount; }
    public LocalDate getTransactionDate() { return transactionDate; }
    public String getDescription() { return description; }
    public boolean isCompleted() { return isCompleted; }

    public void setCompleted(boolean completed) { isCompleted = completed; }
    public String toString() {
        return String.format("ID: %s | Аккаунт: %s | Тип: %s | Сумма: %.2f | Дата: %s | Статус: %s | %s",
                transactionId, accountNumber, transactionType, amount, transactionDate,
                (isCompleted ? "Завершена" : "Отменена"), description);
    }
}
