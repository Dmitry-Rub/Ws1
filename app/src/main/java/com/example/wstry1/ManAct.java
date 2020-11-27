package com.example.wstry1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ManAct extends AppCompatActivity implements View.OnClickListener {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man);
        TextView sex = (TextView) findViewById(R.id.sex);
        UserPar us = new UserPar();
        if(us.sex =="Man")
        {
            sex.setText("Your are Man");
        }
        else
        {
            sex.setText("Your are Woman");
        }
        button = (Button) findViewById(R.id.stepFour);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        button.setBackgroundColor(Color.GRAY);
        Intent intent = new Intent(this, ActivityTrainning.class);
        startActivity(intent);
    }
}