package com.example.sample_android_test_cie;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class My_Radio_Group extends AppCompatActivity {
    private RadioGroup radioSex;
    private RadioButton radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_radio_group);
        radioSex=findViewById(R.id.radioSex);

    }
}