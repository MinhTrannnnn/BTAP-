/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class OrderLine {
    private Currency currency;
    private int quantity;
    private double pricePerUnit;

    public OrderLine(Currency currency, int quantity, double pricePerUnit) {
        this.currency = currency;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(double pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }
    
    // Phương thức tính tổng giá trị của dòng hóa đơn
    public double getTotal() {
        return quantity * pricePerUnit;
    }
    
    @Override
    public String toString() {
        return  quantity + " items " + pricePerUnit + currency.toString() + " each. Total: " + getTotal() + currency.toString();
    }
}
