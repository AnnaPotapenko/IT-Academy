package com.java.homework.homework11;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;
public class Product implements Serializable {
    private final Date dateCreated;
    private String name;
    private String uniqueID = UUID.randomUUID().toString();

    public Product(String name) {
        this.dateCreated = new Date();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    @Override
    public String toString() {
        return "Продукт " +
                name +
                ". Индетификатор: " + uniqueID +
                ", дата изготовления:  " + dateCreated + ".";
    }
}
