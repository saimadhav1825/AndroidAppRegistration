package com.example.registrationactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class ShowData extends AppCompatActivity {
    TextView sname,smail,spass,sgender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_data);
              Intent intent =getIntent();
              String name=intent.getStringExtra("aname");
              String mail=intent.getStringExtra("email");
              String password=intent.getStringExtra("password");
              String gender=intent.getStringExtra("gender");
         sname = findViewById(R.id.textView2);
         smail= findViewById(R.id.textView4);
         spass= findViewById(R.id.textView6);
         sgender= findViewById(R.id.textView8);
         sname.setText(name);
         spass.setText(password);
         smail.setText(mail);
         sgender.setText(gender);

    }
}
