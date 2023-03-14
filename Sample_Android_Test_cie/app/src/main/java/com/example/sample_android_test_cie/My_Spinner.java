package com.example.sample_android_test_cie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class My_Spinner extends AppCompatActivity {
    String[] country={"INDIA","USA","BCA"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_spinner);
        Spinner spinner=(Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.activity_my_spinner,country);

        spinner.setAdapter(adapter);
        //Spinner Drop Down
    }
}