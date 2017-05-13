package com.example.android.moranlee.mysomeapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void add3A(View v){
        scoreA+=3;
        displayTeamA();
    }

    public void add2A(View v){
        scoreA+=2;
        displayTeamA();
    }

    public void add3B(View v){
        scoreB+=3;
        displayTeamB();
    }

    public void add2B(View v){
        scoreB+=2;
        displayTeamB();
    }

    public void displayTeamA(){
        TextView scoreView = (TextView) findViewById(R.id.markA);
        scoreView.setText(String.valueOf(scoreA));
    }

    public void displayTeamB(){
        TextView scoreView = (TextView) findViewById(R.id.markB);
        scoreView.setText(String.valueOf(scoreB));
    }

    public void reset(View v){
        scoreA = 0;
        scoreB = 0;
        displayTeamB();
        displayTeamA();
    }


}
