package com.example.android_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class My_List_View extends AppCompatActivity {
    String[] mobileList={
            "mi","realme","simple"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter adapter=new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2,mobileList);
        ListView lv=findViewById(R.id.list);
        lv.setAdapter(adapter);
    }
}