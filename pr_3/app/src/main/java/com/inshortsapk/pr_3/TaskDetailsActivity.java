package com.inshortsapk.pr_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class TaskDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_details);

        TextView taskDetailsTextView = findViewById(R.id.task_details_text_view);

        String date = getIntent().getStringExtra("date");

        // Retrieve task details from SQLite database
        // ...
        String taskDetails = "Task 1\nTask 2\nTask 3";

        if (taskDetails.isEmpty()) {
            Toast.makeText(this, "No tasks found for this date", Toast.LENGTH_SHORT).show();
        } else {
            taskDetailsTextView.setText(taskDetails);
        }
    }
}