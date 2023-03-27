package com.inshortsapk.pr_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class pr7 extends AppCompatActivity {

      EditText etName, etAge, etPassingYear, etPercentage;
     Spinner spStream;
     Button btnCheckEligibility;
     TextView tvResult;
    DatabaseHelperStudent db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr7);
        db = new DatabaseHelperStudent(this,"STUDENT",null,1);


        etName = findViewById(R.id.et_name);
        etName=findViewById(R.id.et_name);
        etAge = findViewById(R.id.et_age);
        spStream = findViewById(R.id.sp_stream);
        etPassingYear = findViewById(R.id.et_passing_year);
        etPercentage = findViewById(R.id.et_percentage);
        btnCheckEligibility = findViewById(R.id.btn_check_eligibility);
        tvResult = findViewById(R.id.tv_result);

        btnCheckEligibility.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = etName.getText().toString();
                int age = Integer.parseInt(etAge.getText().toString());
                String stream = spStream.getSelectedItem().toString();
                int passingYear = Integer.parseInt(etPassingYear.getText().toString());
                int percentage = Integer.parseInt(etPercentage.getText().toString());

                // Check eligibility criteria
                boolean isEligible = false;
                if (stream.equals("Science") && percentage >= 55) {
                    isEligible = true;
                } else if (stream.equals("Commerce") && percentage >= 60) {
                    isEligible = true;
                }

                // Display result
                if (isEligible) {
                    tvResult.setText("Congratulations " + name + ", you are eligible for admission!");
                    Long Res = db.insertStudent(name, age, percentage, passingYear, stream);
                    if (Res == -1) {
                        Toast.makeText(pr7.this, "Failed", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(pr7.this, "Inserted", Toast.LENGTH_SHORT).show();

                    }
                    // Store student information in database for further follow-up
                    // ...
                } else {
                    tvResult.setText("Sorry " + name + ", you are not eligible for admission.");
                }
            }
        });
        Button btnview;
        btnview=findViewById(R.id.btn_view);
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),viewdetail.class);
                startActivity(i);;
            }
        });
    }
}