
import java.util.ArrayList;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Order {
    private Customer customer;
    private List<OrderLine> orderline;
    private Currency totalCurrency;

    public Order(Customer customer, List<OrderLine> orderline, Currency totalCurrency) {
        this.customer = customer;
        this.orderline = orderline;
        this.totalCurrency = totalCurrency;
    }
    
    // Getter và Setter
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public List<OrderLine> getOrderLines() {
        return orderline;
    }
    
    public Currency getTotalCurrency() {
        return totalCurrency;
    }

    public void setTotalCurrency(Currency totalCurrency) {
        this.totalCurrency = totalCurrency;
    }
    // OrderLine chỉ được tạo và quản lý thông qua danh sách orderLines bên trong Order.
    // Thêm dòng hóa đơn
    public void addLine(OrderLine line) {
        orderline.add(line);
    }

    // Xóa dòng hóa đơn
    public void removeLine(OrderLine line) {
        orderline.remove(line);
    }
    
    public double calculateTotal() {
        double total = 0.0;
        for (OrderLine line : orderline) {
            total += line.getTotal(); // Sử dụng phương thức getTotal() của OrderLine
        }
        return total;
    }
    
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Customer: ").append(customer.getName()).append("\n");
        sb.append("Address: ").append(customer.getAddress()).append("\n");
        sb.append("Order Lines:\n");
        for (OrderLine line : orderline) {
            sb.append(line).append("\n");
        }
        sb.append("Total: ").append(calculateTotal()).append(" ").append(totalCurrency.getName()).append("\n");
        return sb.toString();
    } 
}
