package com.example.my_practicals_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

public class q8 extends AppCompatActivity {

    private myCustomelist[] mobileModels = {
            new myCustomelist("Samsung Galaxy S21", R.drawable.img),
            new myCustomelist("iPhone 12 Pro", R.drawable.img_1),
            new myCustomelist("OnePlus 8 Pro", R.drawable.img_2),
            new myCustomelist("Google Pixel 5", R.drawable.img_3),
            new myCustomelist("Xiaomi Mi 11", R.drawable.img),
            new myCustomelist("Samsung Galaxy Note 20 Ultra", R.drawable.img_1),
            new myCustomelist("iPhone SE (2020)", R.drawable.img_2),
            new myCustomelist("OnePlus Nord", R.drawable.img_3),

    };

    private GridView gridView;
    private MobileModelAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_q8);

        gridView = findViewById(R.id.gridView);
        adapter = new MobileModelAdapter(this, R.layout.grid_item, mobileModels);
        gridView.setAdapter(adapter);
    }
}