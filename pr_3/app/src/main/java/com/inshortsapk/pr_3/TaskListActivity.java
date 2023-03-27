package com.inshortsapk.pr_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;
import com.inshortsapk.pr_3.R;
import android.widget.ListView;

import java.util.List;




public class TaskListActivity extends AppCompatActivity {

     ListView taskListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_list);

        taskListView = findViewById(R.id.taskListView);

        // Get the selected date from the intent
        String date = getIntent().getStringExtra("date");

        // Query the database for all tasks on the selected date
//        List<Task> tasks = TaskDatabase.getInstance(this).getTasksByDate(date);
//
//        if (tasks.size() == 0) {
//            Toast.makeText(this, "No tasks found for this date", Toast.LENGTH_SHORT).show();
//        } else {
//            TaskListAdapter adapter = new TaskListAdapter(this, tasks);
//            taskListView.setAdapter(adapter);
//        }
    }
}
