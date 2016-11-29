package com.example.rm31456.androidservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void atividadeUm(View v){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }

    public void atividadeDois(View v){
        Intent i = new Intent(this, Atividade2Activity.class);
        startActivity(i);
    }

    public void atividadeTres(View v){
        Intent i = new Intent(this, Atividade3Activity.class);
        startActivity(i);
    }
}
