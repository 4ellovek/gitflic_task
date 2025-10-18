package kz.ektu.arystan.variant8;
import java.time.LocalDate;
public class Order {
    private String orderId;
    private String customerName;
    private String productName;
    private double totalPrice;
    private int quantity;
    private String orderStatus;
    private LocalDate orderDate;
    private String shippingAddress;

    public Order(String orderId, String customerName, String productName,
                 double totalPrice, int quantity, String orderStatus,
                 LocalDate orderDate, String shippingAddress) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.productName = productName;
        this.totalPrice = totalPrice;
        this.quantity = quantity;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.shippingAddress = shippingAddress;
    }

    public String getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public String getProductName() { return productName; }
    public double getTotalPrice() { return totalPrice; }
    public int getQuantity() { return quantity; }
    public String getOrderStatus() { return orderStatus; }
    public LocalDate getOrderDate() { return orderDate; }
    public String getShippingAddress() { return shippingAddress; }

    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }
    public String toString() {
        return orderId + " | " + customerName + " | " + productName +
                " | $" + totalPrice + " | " + orderStatus + " | " + orderDate;
    }
}

