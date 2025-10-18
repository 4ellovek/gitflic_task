package kz.ektu.arystan.variant8;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderServiceImpl implements OrderService {
    public List<Order> findOrdersByStatus(List<Order> orders, String status) {
        if (orders == null || status == null) return new ArrayList<>();

        return orders.stream()
                .filter(o -> status.equalsIgnoreCase(o.getOrderStatus()))
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .collect(Collectors.toList());
    }
    public List<Order> findOrdersByDate(List<Order> orders, LocalDate fromDate, LocalDate toDate) {
        if (orders == null || fromDate == null || toDate == null) return new ArrayList<>();

        return orders.stream()
                .filter(o -> (o.getOrderDate().isEqual(fromDate) || o.getOrderDate().isAfter(fromDate)) &&
                        (o.getOrderDate().isEqual(toDate) || o.getOrderDate().isBefore(toDate)))
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .collect(Collectors.toList());
    }
    public List<Order> findHighValueOrders(List<Order> orders, double minAmount) {
        if (orders == null) return new ArrayList<>();

        return orders.stream()
                .filter(o -> o.getTotalPrice() >= minAmount)
                .sorted(Comparator.comparing(Order::getOrderDate).reversed())
                .collect(Collectors.toList());
    }
}

