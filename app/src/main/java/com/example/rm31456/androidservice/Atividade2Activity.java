package com.example.rm31456.androidservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.rm31456.androidservice.services.Logger;

public class Atividade2Activity extends AppCompatActivity {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade2);
        i = new Intent(this, Logger.class);
    }

    public void start(View v){
        startService(i);
    }

    public void stop(View v){

        stopService(i);
    }
}
