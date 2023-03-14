package com.example.cietest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

public class show extends AppCompatActivity {

    RadioGroup g1;
    RadioButton r1;
    Button b1,b2,b3,b4,ba1;

    AutoCompleteTextView a1;


    EditText tt2;

    CheckBox c1,c2,c3;

    StringBuffer bf=new StringBuffer();

    Spinner sp;

    ListView l1;

    String[] st={"surat","amdavad","hello","romit"};





    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        a1=findViewById(R.id.em);

        ArrayAdapter ay=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,st);
        a1.setAdapter(ay);

        t1=findViewById(R.id.show);

        g1=findViewById(R.id.gender);

        b1=findViewById(R.id.sub);

        l1=findViewById(R.id.city1);

        ArrayAdapter adapter1=new ArrayAdapter(getApplicationContext(),android.R.layout.simple_list_item_1,st);
        l1.setAdapter(adapter1);


        sp=findViewById(R.id.city);
        ArrayAdapter adapter=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,st);
        sp.setAdapter(adapter);



        c1=findViewById(R.id.h1);
        c2=findViewById(R.id.h2);
        c3=findViewById(R.id.h3);


        b2=findViewById(R.id.date);
        b3=findViewById(R.id.time);
        b4=findViewById(R.id.alert);

        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                t1.setText(st[position]);

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                al1();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                shodate();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shotime();
            }
        });

        g1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                r1=findViewById(checkedId);
                t1.setText(r1.getText().toString());


            }
        });

        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                t1.setText(st[position]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                bf.delete(0,bf.length());

                if(c1.isChecked()){


                    t1.setText(c1.getText().toString());
                    bf.append(c1.getText().toString());

                }

                if(c2.isChecked()){

                    t1.setText(c2.getText().toString());
                    bf.append(c2.getText().toString());

                }

                if(c3.isChecked()){

                    t1.setText(c3.getText().toString());
                    bf.append(c3.getText().toString());

                }


                t1.setText(bf);

            }
        });





    }

    private void al1() {

        LayoutInflater layoutInflater=LayoutInflater.from(this);
        View view=layoutInflater.inflate(R.layout.cus,null);

        AlertDialog alertDialog=new AlertDialog.Builder(this).setView(view).create();

        ba1=view.findViewById(R.id.cu2);
        tt2=view.findViewById(R.id.cu1);



        alertDialog.show();


        ba1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(tt2.getText().toString());

                alertDialog.cancel();

            }
        });







    }

    private void shotime() {

        TimePickerDialog dialog=new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker view, int hourOfDay, int minute) {

                t1.setText(hourOfDay+"/"+minute);

            }
        },24,60,true);

        dialog.show();
    }

    private void shodate() {

        DatePickerDialog dialog=new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {

                t1.setText(year+"/"+month+1+"/"+dayOfMonth);

            }
        },2022,12,31);

        dialog.show();


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.option,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.yash:
                Toast.makeText(this, "hello", Toast.LENGTH_SHORT).show();
                return true;
        }

        return true;
    }
}