package com.example.my_practicals_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class q4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q4);

        Button btnconvert2 = findViewById(R.id.btnconvrt2);
        EditText txtkg = findViewById(R.id.txtkg);

        btnconvert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int kg = Integer.parseInt(txtkg.getText().toString());
                Double pounds = kg * 2.20462;
                String r=String.valueOf(pounds);

                Toast.makeText(getApplicationContext(), r,Toast.LENGTH_LONG).show();
            }
        });
    }
}