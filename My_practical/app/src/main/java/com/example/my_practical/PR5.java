package com.example.my_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PR5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr5);

        EditText kginput,poundsoutput;
        Button show;

        kginput=findViewById(R.id.input_kg);
        poundsoutput=findViewById(R.id.output_pounds);
        show=findViewById(R.id.btn_pounds);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String kgstring = kginput.getText().toString();
                double kg=Double.parseDouble(kgstring);
                double ans=kg * 2.20462;
                poundsoutput.setText(String.format("%.2f", ans));

            }
        });
    }
}