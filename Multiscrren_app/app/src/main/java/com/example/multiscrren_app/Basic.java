package com.example.multiscrren_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Basic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic);
    }
    public void switchMe(View view)
    {
        String Message="";
        EditText editText=findViewById(R.id.editText4);
        Message=editText.getText().toString();
        Toast.makeText(this, Message, Toast.LENGTH_SHORT).show();

        Intent intent=new Intent(this,Display.class);
        intent.putExtra("Message",Message);
        startActivity(intent);
        Toast.makeText(this, "After me", Toast.LENGTH_SHORT).show();

    }
}