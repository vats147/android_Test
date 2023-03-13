package com.example.my_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class PR6 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr6);

        EditText firstnumber, secondnumber, output;
        Button add, sub, mul, div;

        firstnumber = findViewById(R.id.first_number);
        secondnumber = findViewById(R.id.second_number);
        output = findViewById(R.id.ans_output);


        add = findViewById(R.id.addition);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(firstnumber.getText().toString());
                double num2 = Double.parseDouble(secondnumber.getText().toString());
                double result = num1 + num2;
                output.setText(Double.toString(result));

            }
        });

        sub = findViewById(R.id.subtraction);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(firstnumber.getText().toString());
                double num2 = Double.parseDouble(secondnumber.getText().toString());
                double result = num1 - num2;
                output.setText(Double.toString(result));
            }
        });

        mul = findViewById(R.id.multiplication);
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(firstnumber.getText().toString());
                double num2 = Double.parseDouble(secondnumber.getText().toString());
                double result = num1 * num2;
                output.setText(Double.toString(result));
            }
        });

        div = findViewById(R.id.division);
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double num1 = Double.parseDouble(firstnumber.getText().toString());
                double num2 = Double.parseDouble(secondnumber.getText().toString());
                double result = num1 / num2;
                output.setText(Double.toString(result));
            }
        });
    }
}