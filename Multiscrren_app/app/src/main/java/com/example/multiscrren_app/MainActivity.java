package com.example.multiscrren_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static  final String MSG= "com.codewithharry.Multiscreen.ORDER";
    public void placeOrder(View view)
    {
        //on place order click
        //Intent
        //Build an Intent
        Intent intent=new Intent(this,OrderActivity.class);
        EditText editText1=findViewById(R.id.editText1);
        EditText editText2=findViewById(R.id.editText2);
        EditText editText3=findViewById(R.id.editText3);
        String Message=editText1.getText().toString()+","+editText2.getText().toString()+","+editText3.getText().toString();
        intent.putExtra(MSG,Message);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}