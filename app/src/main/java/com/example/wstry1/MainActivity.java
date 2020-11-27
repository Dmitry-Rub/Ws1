package com.example.wstry1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button butSex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        butSex = (Button) findViewById(R.id.button1);
        butSex.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        butSex.setBackgroundColor(Color.GRAY);
        Intent intent = new Intent(this, SexChangeForm.class);
        startActivity(intent);
    }
}