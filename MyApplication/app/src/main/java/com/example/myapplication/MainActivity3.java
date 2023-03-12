package com.example.myapplication;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivityMain3Binding;

public class MainActivity3 extends AppCompatActivity {
    String[] coursers={"Integrated M.Sc. (IT)","B.Sc.(IT)","BCA","MCA"};
    ListView lstCourses;

    private AppBarConfiguration appBarConfiguration;
    private ActivityMain3Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMain3Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main2);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

        binding.fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

//        controlIntalizaion()\
        ControllIntialzation();
        Toast.mmakeText(this,coursers.length+"", Toast.LENGTH_SHORT.show());
        ArrayAdapter adapter=new ArrayAdapter(this,android.R.layout.simple_list_item_1,coursers);
        lstCourses.setOnItemClickListner(new AdapterView.OnItemClickListener()){
            @Override
            public void onItemClick(AdapterView<?> adapterView,View view,int position,)
            {
                String selectItem=adapter.getItem(position).toString();
                Toast.makeText(getApplicationContext(),selectedItem,Toast.LENGTH_SHORT)
            }
        };
    }


    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main2);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
}