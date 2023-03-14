package com.example.sample_android_test_cie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void myspinner(View view){
        Intent intent=new Intent(MainActivity.this,My_Spinner.class);
        startActivity(intent);
    }
    public void otherclick(View view){
        Intent intent=new Intent(MainActivity.this,Another.class);
        startActivity(intent);
    }
    public void My_Radio_Group(View view)
    {
        Intent intent=new Intent(MainActivity.this,My_Radio_Group.class);
        startActivity(intent);
    }
}