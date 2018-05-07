package com.example.abdulrahman.project8;

public class Item {
    private String Name;
    private int price;
    private int Quantity;
    private String SupplierName;
    private int SupplierPhone;

    public Item(String name, int price, int quantity, String supplierName, int supplierPhone) {
        Name = name;
        this.price = price;
        Quantity = quantity;
        SupplierName = supplierName;
        SupplierPhone = supplierPhone;
    }

    public String getName() {
        return Name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public String getSupplierName() {
        return SupplierName;
    }

    public int getSupplierPhone() {
        return SupplierPhone;
    }
}
