package com.example.dolgozat;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button plus;
    private Button minus;
    private TextView szam;
    private int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i++;
                szam.setText(i);
                if(i==0){
                    szam.setTextColor(Color.rgb(0,0,255));
                } else if (i>0){
                    szam.setTextColor(Color.rgb(0,255,0));
                } else {
                    szam.setTextColor(Color.rgb(255,0,0));
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i--;
                szam.setText(i);
                if(i==0){
                    szam.setTextColor(Color.rgb(0,0,255));
                } else if (i>0){
                    szam.setTextColor(Color.rgb(0,255,0));
                } else {
                    szam.setTextColor(Color.rgb(255,0,0));
                }
            }
        });
        szam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=0;
                szam.setText(i);
                szam.setTextColor(Color.rgb(0,0,255));
            }
        });
    }
    private void init(){
        plus = findViewById(R.id.plus);
        minus = findViewById(R.id.minus);
        szam = findViewById(R.id.szam);
        i = 0;
    }
}