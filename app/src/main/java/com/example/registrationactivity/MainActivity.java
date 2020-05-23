package com.example.registrationactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
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
    int count=5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name= findViewById(R.id.name);
        mail= findViewById(R.id.mail);
        pass= findViewById(R.id.pass);
        id= findViewById(R.id.id);
        f= findViewById(R.id.f);
        m= findViewById(R.id.m);
        ca= findViewById(R.id.ca);
        ca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                int i=id.getCheckedRadioButtonId();
                RadioButton rb=id.findViewById(i);
                String aname=name.getText().toString();
                String email=mail.getText().toString();
                String password=pass.getText().toString();
                String gender=rb.getText().toString();
                Toast.makeText(MainActivity.this,aname+""+""+email+" "+password+rb.getText().toString(),Toast.LENGTH_SHORT).show();
                //System.out.print(aname+""+""+email+" "+password);
                   //if(aname.equals("admin")&&password.equals("1234") ){
                Intent intent = new Intent(MainActivity.this, ShowData.class);
                intent.putExtra("aname", aname);
                       intent.putExtra("email", email);
                       intent.putExtra("password", password);
                       intent.putExtra("gender", gender);
                       startActivity(intent);
                  // }
                  // else{
                    //   count--;

                      // if(count==0)
                       //ca.setEnabled(false);
                   }

        });



    }
}
