package com.example.abdulrahman.project8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class itemAdapter extends BaseAdapter {
    ArrayList<Item> items;
    Context context;

    public itemAdapter(ArrayList<Item> items, Context context) {
        this.items = items;
        this.context = context;
    }

    @Override
    public int getCount() {
        return items.size();
    }

    @Override
    public Object getItem(int position) {
        return items.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.list_ite, null, false);
        TextView name = view.findViewById(R.id.textView);
        TextView price = view.findViewById(R.id.textView2);
        TextView qunt = view.findViewById(R.id.textView3);
        TextView supName = view.findViewById(R.id.textView4);
        TextView supPhone = view.findViewById(R.id.textView5);
        name.setText(items.get(position).getName());
        price.setText(items.get(position).getPrice() + "");
        qunt.setText(items.get(position).getQuantity() + "");
        supName.setText(items.get(position).getSupplierName());
        supPhone.setText(items.get(position).getSupplierPhone() + "");
        return view;
    }
}
