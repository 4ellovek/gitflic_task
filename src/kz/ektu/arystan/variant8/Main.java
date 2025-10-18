package kz.ektu.arystan.variant8;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("O1", "Алия", "Телефон", 150000, 1, "Доставлен", LocalDate.of(2025, 10, 10), "Алматы"));
        orders.add(new Order("O2", "Бекзат", "Ноутбук", 450000, 1, "В пути", LocalDate.of(2025, 10, 15), "Астана"));
        orders.add(new Order("O3", "Динара", "Наушники", 30000, 2, "Доставлен", LocalDate.of(2025, 10, 5), "Шымкент"));

        OrderService service = new OrderServiceImpl();

        System.out.println("Заказы со статусом 'Доставлен':");
        service.findOrdersByStatus(orders, "Доставлен").forEach(System.out::println);

        System.out.println("\nЗаказы за период 01.10.2025 - 12.10.2025:");
        service.findOrdersByDate(orders, LocalDate.of(2025,10,1), LocalDate.of(2025,10,12)).forEach(System.out::println);

        System.out.println("\nЗаказы с суммой больше 100000:");
        service.findHighValueOrders(orders, 100000).forEach(System.out::println);
    }
}
