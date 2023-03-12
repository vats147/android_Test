package com.example.multiscrren_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Display extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);


        Intent intnet=getIntent();
        TextView textView=findViewById(R.id.textView);
        textView.setText(getIntent().getStringExtra("Message").toString());
    }

}