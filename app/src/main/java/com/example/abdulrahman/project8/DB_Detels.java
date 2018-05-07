package com.example.abdulrahman.project8;

public class DB_Detels {
    public final static String DBName = "Product";
    public final static String DBTable = "Item";
    public final static String DBColumName = "productName";
    public final static String DBColumPrice = "Price";
    public final static String DBColumQuantity = "Quantity";
    public final static String DBColumSupplierName = "SupplierName";
    public final static String DBColumSupplierPhone = "upplierPhone";
    public final static int DBversion = 1;
    public final static String CreateDB = "create table " + DBTable + "(" + DBColumName + " TEXT," + DBColumPrice + " INTEGER," + DBColumQuantity +
            " INTEGER," + DBColumSupplierName + " TEXT," + DBColumSupplierPhone + " INTEGER);";

}
