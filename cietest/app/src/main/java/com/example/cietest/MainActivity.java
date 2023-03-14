package com.example.cietest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button b1;
    EditText t1,t2;

    StringBuffer bf=new StringBuffer();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1=findViewById(R.id.sbmit);
        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String name=t1.getText().toString();

                Intent intent=new Intent(getApplicationContext(),show.class);
                intent.putExtra("yash",name);
                startActivity(intent);

            }
        });


    }
}