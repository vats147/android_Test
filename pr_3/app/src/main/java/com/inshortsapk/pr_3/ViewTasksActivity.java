package com.inshortsapk.pr_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ViewTasksActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_tasks);

        ListView listView = findViewById(R.id.list_view);

        // Retrieve dates from SQLite database
        // ...
        String[] dates = new String[] {"2022-11-01", "2022-11-02", "2022-11-03"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dates);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String date = (String) parent.getItemAtPosition(position);

                Intent intent = new Intent(ViewTasksActivity.this, TaskDetailsActivity.class);
                intent.putExtra("date", date);
                startActivity(intent);
            }
        });
    }
}