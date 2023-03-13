package com.example.my_practicals_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class q3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q3);
        Button btnconvert = findViewById(R.id.btnconvert);
        EditText txtfahrenhit = findViewById(R.id.txtfahrenhit);

        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Double num = Double.parseDouble(txtfahrenhit.getText().toString());
                Double cel = ((num-32)*5)/9;
                String r=String.valueOf(cel);

                Toast.makeText(getApplicationContext(), r,Toast.LENGTH_LONG).show();
            }
        });

    }
}