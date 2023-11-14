package com.mycompany.session13;

/**
 *
 * @author jeffs
 */
import java.io.*;

public class Stock implements Serializable {

    // constants
    private static final int DEF_ID = 0;
    private static final String DEF_DESC = "DEF DESC";
    private static final double DEF_PRICE = 0;
    private static final int DEF_QUANTITY = 0;

    // instance variables
    private int id;
    private String desc;
    private double price;
    private int quantity;

    // constructors
    public Stock(int id, String desc, double price, int quantity) {
        this.id = id;
        this.desc = desc;
        this.price = price;
        this.quantity = quantity;
    }

    public Stock() {
        this(DEF_ID, DEF_DESC, DEF_PRICE, DEF_QUANTITY);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Stock{");
        sb.append("id=");
        sb.append(id);
        sb.append(", desc=");
        sb.append(desc);
        sb.append(", price=");
        sb.append(price);
        sb.append(", quantity=");
        sb.append(quantity);
        sb.append('}');
        return sb.toString();
    }

}
