package com.inshortsapk.pr_3;

import androidx.appcompat.app.AppCompatActivity;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Locale;
import android.os.Bundle;

public class viewdetail extends AppCompatActivity {

    DatabaseHelperStudent db;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewdetail);

        tv = findViewById(R.id.tv);

        db = new DatabaseHelperStudent(this,"STUDENT",null,1);
        String output = db.getRecordsStudent();
        String output2 = "";
        output2 = db.getRecordsRating();

        if(output != null){
            if(output2 != null){
                tv.setText(output +"\n"+output2);
                saveToTextFile(output+"\n" + output2);
            }else{
                saveToTextFile(output);
                tv.setText(output);
            }
        }else{
            tv.setText("No Records");
        }

    }

    private void saveToTextFile(String description) {
        //String TimeStamp = new SimpleDateFormat("yyyyMMdd", Locale.getDefault()).format(System.currentTimeMillis());

        try {
            FileOutputStream fos = null;

            try {
                fos = openFileOutput("Student", Context.MODE_PRIVATE);;
                fos.write(description.getBytes());


            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (fos != null) {
                    try {
                        fos.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            Toast.makeText(this, "File Saved", Toast.LENGTH_SHORT).show();
        }catch (Exception e){
            Toast.makeText(this, e.toString(), Toast.LENGTH_SHORT).show();
        }
    }
}