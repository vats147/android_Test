package com.example.multiscrren_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Intent intent=getIntent();
        String Message=intent.getStringExtra(MainActivity.MSG);
        //set to textView
        TextView textView=findViewById(R.id.OrderText);
        textView.setText(Message);
    }

}