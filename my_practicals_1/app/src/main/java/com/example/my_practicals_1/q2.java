package com.example.my_practicals_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class q2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q2);

        Button btncheck1 = findViewById(R.id.check1);
        TextView txtnum1 = findViewById(R.id.num1);

//        int num = Integer.parseInt(txtnum.getText().toString());


        btncheck1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtnum1.getText().toString()  != null)
                {
                    StringBuffer revnum = null;
                    StringBuffer rev = new StringBuffer(txtnum1.getText().toString());
                    revnum = rev.reverse();
                    if(txtnum1.getText().toString().equals(revnum.toString()) ) {
                        Toast.makeText(getApplicationContext(), "Number is Pelindrom", Toast.LENGTH_LONG).show();
                    } else {
                        Toast.makeText(getApplicationContext(), "Number is NOT Pelindrom", Toast.LENGTH_LONG).show();
                    }
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please Enter Number Here...", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}