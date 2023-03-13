package com.example.my_practicals_1;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class answer extends Fragment {

    TextView txtanswer;

    public answer() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_answer, container, false);
       // View v= inflater.inflate(R.layout.fragment_re2, container, false);


        txtanswer=v.findViewById(R.id.txtanswer);

        Bundle bundle=this.getArguments();
        int data=bundle.getInt("key");
        txtanswer.setText("Ans is="+data);


        return v;
    }


}