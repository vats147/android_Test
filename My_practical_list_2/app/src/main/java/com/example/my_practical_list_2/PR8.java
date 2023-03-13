package com.example.my_practical_list_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class PR8 extends AppCompatActivity {

//    public myCustomelist[] mobileModels = {
//            new myCustomelist("Phone 1", R.drawable.o),
//            new myCustomelist("Phone 2", R.drawable.o),
//            new myCustomelist("Phone 4", R.drawable.x),
//            new myCustomelist("phone 3", R.drawable.o),
//            new myCustomelist("phone 5", R.drawable.x),
//
//    };

    public GridView gridView;
//    public MobileModelAdapter a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr8);

        gridView = findViewById(R.id.gridView);
     //   a = new MobileModelAdapter(this, R.layout.grid_item, mobileModels);
       // gridView.setAdapter(a);
    }
}