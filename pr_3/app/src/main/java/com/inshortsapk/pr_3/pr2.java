package com.inshortsapk.pr_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.ArrayList;

public class pr2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr2);

        final EditText dateEditText = findViewById(R.id.date_edit_text);
        final EditText timeEditText = findViewById(R.id.time_edit_text);
        final EditText taskEditText = findViewById(R.id.task_edit_text);
        Button saveButton = findViewById(R.id.save_button);

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String date = dateEditText.getText().toString();
                String time = timeEditText.getText().toString();
                String task = taskEditText.getText().toString();

                // Validate input
                if (date.isEmpty() || time.isEmpty() || task.isEmpty()) {
                    Toast.makeText(pr2.this, "Please fill in all fields", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Save data to SQLite database
                // ...

                // Start ViewTasksActivity
                Intent intent = new Intent(pr2.this, ViewTasksActivity.class);
                startActivity(intent);
            }
        });
    }


}