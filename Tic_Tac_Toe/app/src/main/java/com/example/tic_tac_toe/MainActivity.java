package com.example.tic_tac_toe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // 0- X
    //1 -0
    // 2 -blank
    int activePlayer=0;
    int[] gameState ={2,2,2,2,2,2,2,2,2};
    int[][] winPosition={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    public void playerTap(View v)
    {
        Toast.makeText(this, "Inside Playetap", Toast.LENGTH_SHORT).show();

        ImageView img=(ImageView)v;
        int tappedImage=Integer.parseInt(img.getTag().toString());
        if(gameState[tappedImage]==2)
        {
            Toast.makeText(this, "Something click", Toast.LENGTH_SHORT).show();
            gameState[tappedImage]=activePlayer;
            img.setTranslationY(-1000f);
            if(activePlayer==0)
            {
                img.setImageResource(R.drawable.grid);
                activePlayer=1;
            }
            else{
                img.setImageResource(R.drawable.o);

                activePlayer=0;
            }
            img.animate().translationYBy(1000f).setDuration(300);
            Toast.makeText(this, "Something Not click", Toast.LENGTH_SHORT).show();

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Toast.makeText(this, "Sample Toast", Toast.LENGTH_SHORT).show();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



}