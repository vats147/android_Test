package com.example.first_application_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    
    public void sendNow(View view){
        Toast.makeText(this, "This is send button", Toast.LENGTH_SHORT).show();
    }

    public void deleteNow(View view){
        Toast.makeText(this, "This is Delete button", Toast.LENGTH_SHORT).show();
    }

    public void updateNow(View view){
        Toast.makeText(this, "This is Update button", Toast.LENGTH_SHORT).show();
    }

}