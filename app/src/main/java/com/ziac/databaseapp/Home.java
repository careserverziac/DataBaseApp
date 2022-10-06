package com.ziac.databaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);


      //  MARK ATTENADENCE

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,MainActivity.class);
               startActivity(i);
            }
        });


        // VIEW ATTENDANCE

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Home.this,ViewAttendance.class);
                startActivity(i);
            }
        });




    }
}