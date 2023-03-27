package com.inshortsapk.pr_3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void p1(View view)
    {
        Intent i=new Intent(this,pr1.class);
        startActivity(i);
    }
    public void p2(View view)
    {
        Intent i=new Intent(this,pr2.class);
        startActivity(i);
    }
    public void p3(View view)
    {
        Intent i=new Intent(this,pr3.class);
        startActivity(i);
    }
    public void p4(View view)
    {
        Intent i=new Intent(this,pr4.class);
        startActivity(i);
    }
    public void p5(View view)
    {
        Intent i=new Intent(this,pr5.class);
        startActivity(i);
    }
    public void p6(View view)
    {
        Intent i=new Intent(this,pr6.class);
        startActivity(i);
    }
    public void p7(View view)
    {
        Intent i=new Intent(this,pr7.class);
        startActivity(i);
    }

}