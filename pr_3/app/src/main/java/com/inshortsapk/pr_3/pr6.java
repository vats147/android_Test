package com.inshortsapk.pr_3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class pr6 extends AppCompatActivity {
    EditText contact,item,qty;
    Button save;
    DBmanager db;
    SimpleCursorAdapter adapter;
    int ORDERID = 0;
    String CONTACT_NO;
    String ITEM_NAME;
    int QUANTITY;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr6);

        contact = findViewById(R.id.contactno);
        item = findViewById(R.id.item_name);
        qty = findViewById(R.id.quantity);
        save= findViewById(R.id.btnsavedata);
        Button btnView=findViewById(R.id.btnView);

        db = new DBmanager(this);
        db.Open();

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //ORDERID = Integer.parseInt();
                String CONTACT_NO = contact.getText().toString();
                String ITEM_NAME = item.getText().toString();
                int QUANTITY = Integer.parseInt(qty.getText().toString());

                // Call your AddOrder method here
                db.AddOrder(CONTACT_NO, ITEM_NAME, QUANTITY);
                Toast.makeText(pr6.this, "Added succesfully", Toast.LENGTH_SHORT).show();
            }
        });
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(pr6.this,view_order.class);
                startActivity(i);
            }
        });

    }
}