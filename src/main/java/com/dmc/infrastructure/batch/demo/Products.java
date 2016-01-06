package com.dmc.infrastructure.batch.demo;

/**
 * @author xiaobianchen
 * @version 1.0 2016/1/6
 * @link https://github.com/xiaobianchen/DMC
 * POJO Object
 */
public class Products {
    private int id;
    private String name;
    private String description;
    private int quantity;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
