package kz.ektu.arystan.variant8;
import java.time.LocalDate;
import java.util.List;
public interface OrderService {
    List<Order> findOrdersByStatus(List<Order> orders, String status);
    List<Order> findOrdersByDate(List<Order> orders, LocalDate fromDate, LocalDate toDate);
    List<Order> findHighValueOrders(List<Order> orders, double minAmount);
}
