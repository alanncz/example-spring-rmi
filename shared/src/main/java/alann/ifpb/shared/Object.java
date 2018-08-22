/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alann.ifpb.shared;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author alann
 */
public class Object implements Serializable{
    
    private String item;
    private int qty;
    private LocalDateTime orderDate;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "item='" + item + '\'' +
                ", qty=" + qty +
                ", orderDate=" + orderDate +
                '}';
    }
    
}
