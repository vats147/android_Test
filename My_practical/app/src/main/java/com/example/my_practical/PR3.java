package com.example.my_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PR3 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr3);

        EditText faherenheitInput;
        TextView celsiusOutput;
        Button show;

        faherenheitInput=findViewById(R.id.fahrenheit_input);
        celsiusOutput=findViewById(R.id.celsius_output);
        show=findViewById(R.id.btnshow);

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double faherenheit=Double.parseDouble(faherenheitInput.getText().toString());
                double celsius=(faherenheit-32)*5/9;
                celsiusOutput.setText(String.valueOf(celsius));

//               (100°F − 32) × 5/9 = 37.778°C  formula
            }
        });

    }
}