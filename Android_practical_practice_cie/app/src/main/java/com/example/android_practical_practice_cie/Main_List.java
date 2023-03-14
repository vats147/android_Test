package com.example.android_practical_practice_cie;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main_List extends AppCompatActivity {

    String[]  mobileList={"Mi","Realme","iphone"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);

        ArrayAdapter adpater=new ArrayAdapter<String>(this,R.layout.activity_main_list,mobileList);

        ListView listview=(ListView) findViewById(R.id.listview);
        listview.setAdapter(adpater);
    }

}