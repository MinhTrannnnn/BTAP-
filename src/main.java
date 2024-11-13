
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        // Tạo khách hàng và tiền tệ
        Customer customer1 = new Customer("123 Main Street", "KH001", "Donald Trump");
        Currency usd = new Currency("USD");

        // Tạo các dòng hóa đơn
        OrderLine orderLine1 = new OrderLine(usd, 2, 50.0);
        OrderLine orderLine2 = new OrderLine(usd, 1, 30.0);
        Order order1 = new Order(customer1, List.of(orderLine1, orderLine2), usd);

        Customer customer2 = new Customer("1111 Ha Noi", "KH002", "Taylor Swift");
        OrderLine orderLine3 = new OrderLine(usd, 3, 20.0);
        Order order2 = new Order(customer2, List.of(orderLine3), usd);

        // Tạo OrderList
        OrderList orderList = new OrderList();

        // Thêm đơn hàng vào OrderList
        orderList.add(order1);
        orderList.add(order2);

        // In danh sách đơn hàng
//        System.out.println("Order List:");
//        orderList.printOrders();

        // Sử dụng iterator để duyệt qua danh sách đơn hàng
        System.out.println("\nChecking list using iterator");
        Iterator<Order> iterator = orderList.getIterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            System.out.println(order);
        }
        
        // Ví dụ xóa order:
        System.out.println("Vi du khi xoa order2");
        orderList.remove(order2);
        Iterator<Order> iterator1 = orderList.getIterator();
        while (iterator1.hasNext()) {
            Order order = iterator1.next();
            System.out.println(order);
        }
    }
}
