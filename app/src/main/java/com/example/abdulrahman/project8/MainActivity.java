package com.example.abdulrahman.project8;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    TextView msg;
    ListView listView;
    DBManager manager;
    ArrayList<Item> items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = findViewById(R.id.msg);
        listView = findViewById(R.id.list_items);
        manager = new DBManager(this);
        items = new ArrayList<>();
        loadData();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.additem:
                startActivity(new Intent(this, addItem.class));
                finish();
        }
        return super.onOptionsItemSelected(item);
    }

    public void loadData() {
        Cursor cursor = manager.querasy(null, null, null, DB_Detels.DBColumName);
        if (cursor.moveToFirst()) {
            do {
                items.add(new Item(cursor.getString(cursor.getColumnIndex(DB_Detels.DBColumName)),
                        cursor.getInt(cursor.getColumnIndex(DB_Detels.DBColumPrice)), cursor.getInt(cursor.getColumnIndex(DB_Detels.DBColumQuantity)),
                        cursor.getString(cursor.getColumnIndex(DB_Detels.DBColumSupplierName)), cursor.getInt(cursor.getColumnIndex(DB_Detels.DBColumSupplierPhone))));
            } while (cursor.moveToNext());
        }
        itemAdapter arrayAdapter = new itemAdapter(items, this);
        listView.setAdapter(arrayAdapter);
    }
}
