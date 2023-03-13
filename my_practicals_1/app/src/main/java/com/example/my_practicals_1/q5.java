package com.example.my_practicals_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class q5 extends AppCompatActivity {

    Button add,sub,mul,div;
    EditText txtnum1,txtnum2;
    TextView answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q5);

        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        txtnum1 = findViewById(R.id.txtnum1);
        txtnum2 = findViewById(R.id.txtnum2);
        answer = findViewById(R.id.lblanswer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(txtnum1.getText().toString());
                Double num2 = Double.parseDouble(txtnum2.getText().toString());
                Double add = num1 + num2;
                answer.setText(String.valueOf(add));
            }

        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(txtnum1.getText().toString());
                Double num2 = Double.parseDouble(txtnum2.getText().toString());
                Double sub = num1 - num2;
                answer.setText(String.valueOf(sub));
            }

        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(txtnum1.getText().toString());
                Double num2 = Double.parseDouble(txtnum2.getText().toString());
                Double mul = num1 * num2;
                answer.setText(String.valueOf(mul));
            }

        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num1 = Double.parseDouble(txtnum1.getText().toString());
                Double num2 = Double.parseDouble(txtnum2.getText().toString());
                Double div = num1 / num2;
                answer.setText(String.valueOf(div));
            }

        });
    }
}