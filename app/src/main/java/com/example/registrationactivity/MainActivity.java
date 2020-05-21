package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name;
    EditText mail;
    EditText pass;
    RadioButton f;
    RadioButton m;
    RadioGroup id;
    Button ca;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=(EditText)findViewById(R.id.name);
        mail=(EditText)findViewById(R.id.mail);
        pass=(EditText)findViewById(R.id.pass);
        id=(RadioGroup)findViewById(R.id.id);
        f=(RadioButton)findViewById(R.id.f);
        m=(RadioButton)findViewById(R.id.m);
        ca=(Button)findViewById(R.id.ca);
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int i=id.getCheckedRadioButtonId();
                RadioButton rb=id.findViewById(i);
                String aname=name.getText().toString();
                String email=mail.getText().toString();
                String password=pass.getText().toString();
                Toast.makeText(MainActivity.this,aname+""+""+email+" "+password+rb.getText().toString(),Toast.LENGTH_SHORT).show();
                System.out.print(aname+""+""+email+" "+password);
            }
        });



    }
}
