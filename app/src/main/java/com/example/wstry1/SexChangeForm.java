package com.example.wstry1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SexChangeForm extends AppCompatActivity implements View.OnClickListener {
    Button bMan, bWom, BNext;
    Intent intent = null;
    UserPar us;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        try {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_sex_change_form);
            us = new UserPar();
            bMan = (Button) findViewById(R.id.man);
            bMan.setOnClickListener(this);
            bWom = (Button) findViewById(R.id.woman);
            bWom.setOnClickListener(this);
            BNext = (Button) findViewById(R.id.nextB);
            BNext.setOnClickListener(this);
        } catch (Exception e) {
            Log.e("Ex", e.toString());
        }
    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.man:
                us.sex = "Man";
                bWom.setBackgroundColor(Color.rgb(121,48, 180));
                bMan.setBackgroundColor(Color.GRAY);
                intent = new Intent(this, ManAct.class);
                break;
            case R.id.woman:
                us.sex = "Woman";
                bMan.setBackgroundColor(Color.rgb(121,48, 180));
                bWom.setBackgroundColor(Color.GRAY);
                intent = new Intent(this, ManAct.class);
                break;
            case R.id.nextB:

                if(intent!=null)
                {
                    startActivity(intent);
                }
                break;
        }
    }
}