package com.example.android_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button sample1,listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sample1=findViewById(R.id.button);
        listView=findViewById(R.id.button3);
        sample1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Hello World", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,sample1.class);
                startActivity(intent);
            }
        });
        listView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,My_List_View.class);
                startActivity(intent);

            }
        });


    }
    public void spinner(){
        Intent intent=new Intent(MainActivity.this,My_Spinner.class);
        startActivity(intent);
    }
}