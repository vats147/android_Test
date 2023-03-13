package com.example.my_practical_list_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class PR3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr3);


        Button btnclick = findViewById(R.id.btnclick);
        TextView txtname = findViewById(R.id.txtname);
        TextView displayview = findViewById(R.id.txtdisplayview);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(txtname.getText().toString() != null){
                    displayview.setText(txtname.getText().toString());
                    Toast.makeText(getApplicationContext(), txtname.getText().toString(), Toast.LENGTH_LONG).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Please Name...", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}