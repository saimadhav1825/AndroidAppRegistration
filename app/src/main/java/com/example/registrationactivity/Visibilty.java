package com.example.registrationactivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class Visibilty  extends AppCompatActivity {
    Button b1,b2,b3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visbility);

        b1 = (Button) findViewById(R.id.button);
        b2 = (Button) findViewById(R.id.button2);
        b3 = (Button) findViewById(R.id.button3);

    }
    public void b1Clicked(View v)
    {
        b1.setVisibility(View.INVISIBLE);
        b2.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
            }
    public void b2Clicked(View v)
    {
        b2.setVisibility(View.INVISIBLE);
        b1.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
    }
    public void b3Clicked(View v)
    {
        b3.setVisibility(View.INVISIBLE);
        b1.setVisibility(View.VISIBLE);
        b3.setVisibility(View.VISIBLE);
    }
    }
