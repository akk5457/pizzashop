package edu.psu.abington.ist.ist242;

import java.util.*;


public class Order {

    private int orderId;
    private Customer cust;
    private ArrayList<Menu> menuItem;
    private static ArrayList<Order> orderList = new ArrayList<>();

    public Order(int _orderId) {
        this.orderId = _orderId;
    }

    public int getorderId() {
        return orderId;
    }

    public void setorderId(int _orderId) {
        this.orderId = _orderId;
    }

    public static ArrayList<Order> addOrders(Order order, Customer customer, ArrayList<Menu> mList, ArrayList<Order> orderList){

        order.setorderId(order.getorderId());
        order.setCust(customer);
        order.setMenuItem(mList);
        order.setCust(customer);
        orderList.add(order);
        System.out.println("Order added with order ID: " + order.getorderId());
        System.out.print("With Menu: ");
        for(Menu menu : mList){
            System.out.println(menu.getmenuItem());
        }
        System.out.println("Customer Name: " + order.getCust().getCustomerName()
                + ", Customer ID: " + order.getCust().getCustomerId());

        return orderList;
    }

    public ArrayList<Menu> getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(ArrayList<Menu> menuItem) {
        this.menuItem = menuItem;
    }

    public Customer getCust() {
        return cust;
    }

    public void setCust(Customer cust) {
        this.cust = cust;
    }
}
