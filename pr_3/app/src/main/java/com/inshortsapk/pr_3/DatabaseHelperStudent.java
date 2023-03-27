package com.inshortsapk.pr_3;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelperStudent extends SQLiteOpenHelper {
    String Query,Query2,output="",output2="";
    public DatabaseHelperStudent(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        Query = "CREATE TABLE STUDENT(id INTEGER PRIMARY KEY AUTOINCREMENT,name varchar(50),age int" +
                ",percentage int,year int,stream varchar(50));";
        Query2 = "CREATE TABLE RATING(id INTEGER PRIMARY KEY AUTOINCREMENT,name varchar(50)" +
                ",rating varchar(50));";
        sqLiteDatabase.execSQL(Query);
        sqLiteDatabase.execSQL(Query2);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        Query = "drop table if exists STUDENT";
        sqLiteDatabase.execSQL(Query);
        onCreate(sqLiteDatabase);
    }
    public long insertStudent(String name,int age,int per,int year,String stream){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name",name);
        cv.put("age",age);
        cv.put("percentage",per);
        cv.put("year",year);
        cv.put("stream",stream);
        long result = db.insert("STUDENT",null,cv);
        return  result;
    }
    public long insertRating(String name,String rating){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("name",name);
        cv.put("rating",rating);
        long result = db.insert("RATING",null,cv);
        return  result;
    }
    public String getRecordsStudent(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from STUDENT",null);
        while(cursor.moveToNext()){
            output += "Student Name: " + cursor.getString(1) +" \nage: " + cursor.getString(2)
                    +" \nPercentage: "+ cursor.getString(3)
                    +" \nYear: "+ cursor.getString(4)
                    +" \nStream: "+ cursor.getString(5);
        }
        return output;
    }
    public String getRecordsRating(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from RATING",null);
        while(cursor.moveToNext()){
            output2 += "\nStudent Name: " + cursor.getString(1) +" \nRating: " + cursor.getString(2) + "\n\n";
        }
        return output2;
    }
}
