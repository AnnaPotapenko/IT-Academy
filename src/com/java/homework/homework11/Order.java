package com.java.homework.homework11;
import java.util.Date;
import java.util.UUID;

public class Order {

    private String clientName;
    private String productName;
    private int amount;
    private final Date dateCreated;
    private String orderID = UUID.randomUUID().toString();

    public Order(String clientName, String productName, int amount) {
        this.clientName = clientName;
        this.productName = productName;
        this.amount = amount;
        this.dateCreated = new Date();
    }

    @Override
    public String toString() {
        return "Имя покупателя: " + clientName + ". Название заказываемого продукта: " + productName  +
                ", колличество: " + amount + ". Индетификатор: " + orderID +
                ", дата оформления заказа:  " + dateCreated + ".";
    }

    public String getClientName() {
        return clientName;
    }

    public String getProductName() {
        return productName;
    }

    public int getAmount() {
        return amount;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public String getOrderID() {
        return orderID;
    }

}
