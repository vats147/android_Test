package com.example.android_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Spinner;

public class My_Spinner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_spinner);

        //find spinner
        Spinner spinner=(Spinner) findViewById(R.id.spinner);
       // spinner.setOnClickListener();
    }
}