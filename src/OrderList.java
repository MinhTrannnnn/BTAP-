
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
public class OrderList {
    private List<Order> orders;
    
    public OrderList(){
        orders = new ArrayList<>();
    }
    
    // Thêm một đơn hàng vào danh sách
    public void add(Order order) {
        orders.add(order);
    }

    // Lấy số lượng đơn hàng trong danh sách
    public int getCount() {
        return orders.size();
    }

    // Trả về iterator có sẵn của danh sách đơn hàng
    public Iterator<Order> getIterator() {
        return orders.iterator(); // Trả về iterator của danh sách orders
    }

    // Xóa một đơn hàng khỏi danh sách
    public void remove(Order order) {
        orders.remove(order);
    }
}
