package com.example.wstry1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTrainning extends AppCompatActivity implements View.OnClickListener {
    Button bNext, par;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trainning);
        par = (Button) findViewById(R.id.par);
        par.setOnClickListener(this);
        bNext = (Button) findViewById(R.id.next);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId())
        {
            case R.id.par:
                par.setBackgroundColor(Color.GRAY);
                intent = new Intent(this, YourParametrs.class);
                break;
            case R.id.next:
                if(intent!=null) {
                    startActivity(intent);
                }
                break;
        }

    }
}