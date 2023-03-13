package com.example.my_practical;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class PR7 extends AppCompatActivity {


    private static final String TAG = "q6";
    private TextView mLifecycleTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr6);

        mLifecycleTextView = findViewById(R.id.lifecycle_text_view);
        Log.d(TAG, "onCreate() method called");
        mLifecycleTextView.append("\nonCreate() method called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart() method called");
        mLifecycleTextView.append("\nonStart() method called");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume() method called");
        mLifecycleTextView.append("\nonResume() method called");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() method called");
        mLifecycleTextView.append("\nonPause() method called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() method called");
        mLifecycleTextView.append("\nonStop() method called");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy() method called");
        mLifecycleTextView.append("\nonDestroy() method called");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() method called");
        mLifecycleTextView.append("\nonRestart() method called");
    }
}