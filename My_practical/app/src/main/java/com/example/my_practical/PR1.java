package com.example.my_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PR1 extends AppCompatActivity {

    TextView showtxt;
    EditText nametxt;
    Button settxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr1);

        showtxt=findViewById(R.id.show);
        nametxt=findViewById(R.id.name);
        settxt=findViewById(R.id.set);

        settxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                showtxt.setText(nametxt.getText());
            }
        });
    }
}