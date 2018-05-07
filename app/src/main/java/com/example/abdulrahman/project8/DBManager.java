package com.example.abdulrahman.project8;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

public class DBManager {
    DBHelper helper;

    public DBManager(Context context) {
        helper = new DBHelper(context);
    }

    public void insert(Item item) {
        SQLiteDatabase database = helper.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(DB_Detels.DBColumName, item.getName());
        values.put(DB_Detels.DBColumPrice, item.getPrice());
        values.put(DB_Detels.DBColumQuantity, item.getQuantity());
        values.put(DB_Detels.DBColumSupplierName, item.getSupplierName());
        values.put(DB_Detels.DBColumSupplierPhone, item.getSupplierPhone());
        database.insert(DB_Detels.DBTable, null, values);
    }

    public Cursor querasy(String[] projection, String selection, String[] selectionArr, String SortOrder) {
        SQLiteDatabase database = helper.getWritableDatabase();
        SQLiteQueryBuilder sqLiteQueryBuilder = new SQLiteQueryBuilder();
        sqLiteQueryBuilder.setTables(DB_Detels.DBTable);

        Cursor cursor = sqLiteQueryBuilder.query(database, projection, selection, selectionArr, null, null, SortOrder);

        return cursor;

    }
}
