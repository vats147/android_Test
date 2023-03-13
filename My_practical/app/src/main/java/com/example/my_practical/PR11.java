package com.example.my_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PR11 extends AppCompatActivity {

    Button fg1,fg2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr11);

        fg1 = findViewById(R.id.btnfg1);
        fg2 = findViewById(R.id.btnfg2);

        fg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer,new frag1()).commit();
            }
        });

        fg2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().add(R.id.fragmentContainer,new frag2()).commit();
            }
        });
    }
}