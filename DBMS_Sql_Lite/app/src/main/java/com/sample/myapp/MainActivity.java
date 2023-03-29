package com.sample.myapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //create database object
    database g=new database(this);
    EditText name,username,password;
    Button insert,delete,view,edit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SQLiteDatabase db=g.getReadableDatabase();

        name=findViewById(R.id.name);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        insert=findViewById(R.id.ins);
        delete=findViewById(R.id.del);
        view=findViewById(R.id.view);
        edit=findViewById(R.id.update); 

        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NAME=name.getText().toString();
                String USERNAME=username.getText().toString();
                String PASSWORD=password.getText().toString();
                if(NAME.equals("")||PASSWORD.equals("")||USERNAME.equals(""))
                {
                    Toast.makeText(MainActivity.this, "Enter All fileds", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if(g.insert_data(NAME,USERNAME,PASSWORD))
                    {
                        Toast.makeText(MainActivity.this, "Data Inserted Succssfully", Toast.LENGTH_SHORT).show();
                        name.setText("");
                        username.setText("");
                        password.setText("");
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Data Not Inserted Successfully", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor t=g.get_data();
                if(t.getCount()==0)
                {
                    Toast.makeText(MainActivity.this, "No Data Founc", Toast.LENGTH_SHORT).show();
                }
                StringBuffer buffer=new StringBuffer();
                while(t.moveToNext())
                {
                    buffer.append("Name: "+t.getString(1)+"\n");
                    buffer.append("Username: "+t.getString(2)+"\n");
                    buffer.append("Password: "+t.getString(3)+"\n\n\n");

                }
                AlertDialog.Builder ab=new AlertDialog.Builder(MainActivity.this);
                ab.setCancelable(true);
                ab.setTitle("SIGN up user Data");
                ab.setMessage(buffer.toString());
                ab.show();

            }
        });
        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String NAME=name.getText().toString();
                String USERNAME=username.getText().toString();
                String PASSWORD=password.getText().toString();
                if(g.update_data(NAME,USERNAME,PASSWORD))
                {
                    Toast.makeText(MainActivity.this, "Data Updated Successfully", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Data Not FOund", Toast.LENGTH_SHORT).show();
                }
            }
        });
        
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String USERNAME=username.getText().toString();
                if(g.delete_data(USERNAME))
                {
                    Toast.makeText(MainActivity.this, "Data Deleted Succesfully", Toast.LENGTH_SHORT).show();
                    
                }
                else
                {
                    Toast.makeText(MainActivity.this, "Data not delted ", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}