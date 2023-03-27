package com.inshortsapk.pr_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class view_order extends AppCompatActivity {
    ListView lstorders;
    DBmanager db;
    SimpleCursorAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_order2);

        lstorders = findViewById(R.id.lstorders);
        db = new DBmanager(this);
        db.Open();
        ViewOrdersList();

    }

    public void ViewOrdersList()
    {
        Cursor c = db.ViewOrders();
        String[] from = new String[]{
                DatabaseHelper.ORDERID,
                DatabaseHelper.CONTACT_NO,
                DatabaseHelper.ITEM_NAME,
                DatabaseHelper.QUANTITY
        };

        int[] to = new int[]{
                R.id.lblorderid,                                                          
                R.id.lblcontact,
                R.id.lblitem,
                R.id.lblqty
        };

        adapter = new SimpleCursorAdapter(view_order.this,R.layout.order_list,
                c,from,to,0);
        lstorders.setEmptyView(findViewById(R.id.empty));
        adapter.notifyDataSetChanged();
        lstorders.setAdapter(adapter);

    }
}