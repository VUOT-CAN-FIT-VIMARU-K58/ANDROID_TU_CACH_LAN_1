package com.example.test_tucach;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView yellow1,yellow2,red1,red2,red3,red4,red5,Green1,Green2,Green3,blue1,blue2,blue3,purple1,purple2;
    private int C,red=0,yellow=0,blue=0,purple=0,Green=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.registerControlandEvents();
    }

    @Override
    protected void onStop() {
        TienIch.Generate();
        if(TienIch.InClass(C))
            Toast.makeText(MainActivity.this,C + " - Có",Toast.LENGTH_SHORT).show();
        else
            Toast.makeText(MainActivity.this,C + " - Không",Toast.LENGTH_SHORT).show();
        C = 0;
        super.onStop();
    }
    private void registerControlandEvents(){
        this.yellow1 = (TextView)findViewById(R.id.yellow1);
        this.yellow2 = (TextView)findViewById(R.id.yellow2);

        this.red1 = (TextView)findViewById(R.id.red1);
        this.red2 = (TextView)findViewById(R.id.red2);
        this.red3 = (TextView)findViewById(R.id.red3);
        this.red4 = (TextView)findViewById(R.id.red4);
        this.red5 = (TextView)findViewById(R.id.red5);

        this.Green1 = (TextView)findViewById(R.id.Green1);
        this.Green2 = (TextView)findViewById(R.id.Green2);
        this.Green3 = (TextView)findViewById(R.id.Green3);

        this.blue1 = (TextView)findViewById(R.id.blue1);
        this.blue2 = (TextView)findViewById(R.id.blue2);
        this.blue3 = (TextView)findViewById(R.id.blue3);

        this.purple1 = (TextView)findViewById(R.id.purple1);
        this.purple2 = (TextView)findViewById(R.id.purple2);
    }
    public void RedClick(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(red == 0){
                    red1.setVisibility(View.INVISIBLE);
                    red2.setVisibility(View.INVISIBLE);
                    red3.setVisibility(View.INVISIBLE);
                    red4.setVisibility(View.INVISIBLE);
                    red5.setVisibility(View.INVISIBLE);
                    red = 1;
                }
                else if(red == 1){
                    red1.setVisibility(View.VISIBLE);
                    red2.setVisibility(View.VISIBLE);
                    red3.setVisibility(View.VISIBLE);
                    red4.setVisibility(View.VISIBLE);
                    red5.setVisibility(View.VISIBLE);
                    red = 0;
                }
                C++;
            }
        });
    }
    public void YellowClick(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(red == 0){
                    yellow1.setVisibility(View.INVISIBLE);
                    yellow2.setVisibility(View.INVISIBLE);
                    yellow = 1;
                }
                else if(yellow == 1){
                    yellow1.setVisibility(View.VISIBLE);
                    yellow2.setVisibility(View.VISIBLE);
                    yellow = 0;
                }
                C++;
            }
        });
    }
    public void GreenClick(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(Green == 0){
                    Green1.setVisibility(View.INVISIBLE);
                    Green2.setVisibility(View.INVISIBLE);
                    Green3.setVisibility(View.INVISIBLE);
                    Green = 1;
                }
                else if(Green == 1){
                    Green1.setVisibility(View.VISIBLE);
                    Green2.setVisibility(View.VISIBLE);
                    Green3.setVisibility(View.VISIBLE);
                    Green = 0;
                }
                C++;
            }
        });
    }
    public void PurpleClick(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(purple == 0){
                    purple1.setVisibility(View.INVISIBLE);
                    purple2.setVisibility(View.INVISIBLE);
                    purple = 1;
                }
                else if(purple == 1){
                    purple1.setVisibility(View.VISIBLE);
                    purple2.setVisibility(View.VISIBLE);
                    purple = 1;
                }
                C++;
            }
        });
    }
    public void BlueClick(View view){
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(blue == 0){
                    blue1.setVisibility(View.INVISIBLE);
                    blue2.setVisibility(View.INVISIBLE);
                    blue3.setVisibility(View.INVISIBLE);
                    blue = 1;
                }
                else if(blue == 1){
                    blue1.setVisibility(View.INVISIBLE);
                    blue2.setVisibility(View.INVISIBLE);
                    blue3.setVisibility(View.INVISIBLE);
                    blue = 1;
                }
                C++;
            }
        });
    }
}