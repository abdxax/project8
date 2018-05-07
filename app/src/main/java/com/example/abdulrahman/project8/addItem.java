package com.example.abdulrahman.project8;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class addItem extends AppCompatActivity {
    EditText name;
    EditText price;
    EditText quintity;
    EditText suppiename;
    EditText suppiephone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);
        name = findViewById(R.id.editText);
        price = findViewById(R.id.editText2);
        quintity = findViewById(R.id.editText3);
        suppiename = findViewById(R.id.editText4);
        suppiephone = findViewById(R.id.editText5);
    }

    public void Save(View view) {
        DBManager manager = new DBManager(this);
        Item item = new Item(name.getText().toString(), Integer.parseInt(price.getText().toString()),
                Integer.parseInt(quintity.getText().toString()), suppiename.getText().toString(),
                Integer.parseInt(suppiephone.getText().toString()));
        manager.insert(item);
        startActivity(new Intent(this, MainActivity.class));
        finish();

    }
}
