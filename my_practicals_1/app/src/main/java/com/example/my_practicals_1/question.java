package com.example.my_practicals_1;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class question extends Fragment implements View.OnClickListener {

    public question() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_question, container, false);
        Button add = view.findViewById(R.id.addition);
        Button sub = view.findViewById(R.id.subtraction);
        Button mul = view.findViewById(R.id.multiplication);
        Button div = view.findViewById(R.id.division);

        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);

        return view;
    }
    public int calc(int a, int b, char c){
        if(c == '+'){
            return a+b;
        }
        else if(c == '-'){
            return a-b;
        }
        else if(c == '*'){
            return a*b;
        }
        else {
            return a/b;
        }

    }

    @Override
    public void onClick(View v) {
        EditText etNum1 = view.findViewById(R.id.input1);
        EditText etNum2 = view.findViewById(R.id.input2);
        String tvRes;
        int res;
        Bundle bundle = new Bundle();
        switch (v.getId()){
            case R.id.add:
                res = calc(Integer.parseInt(etNum1.getText().toString()),Integer.parseInt(etNum2.getText().toString()),'+');
                bundle.putString("result",Integer.toString(res));
                getParentFragmentManager().setFragmentResult("question",bundle);
                break;
            case R.id.sub:
                res = calc(Integer.parseInt(etNum1.getText().toString()),Integer.parseInt(etNum2.getText().toString()),'-');
                bundle.putString("result",Integer.toString(res));
                getParentFragmentManager().setFragmentResult("question",bundle);
                break;
            case R.id.mul:
                res = calc(Integer.parseInt(etNum1.getText().toString()),Integer.parseInt(etNum2.getText().toString()),'*');
                bundle.putString("result",Integer.toString(res));
                getParentFragmentManager().setFragmentResult("question",bundle);
                break;
            case R.id.div:
                res = calc(Integer.parseInt(etNum1.getText().toString()),Integer.parseInt(etNum2.getText().toString()),'/');
                bundle.putString("result",Integer.toString(res));
                getParentFragmentManager().setFragmentResult("question",bundle);
                break;
        }
    }
}