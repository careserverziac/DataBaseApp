package com.ziac.databaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    Button mark,absent;
    EditText name;
    private DatabaseReference mdatabasereference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        absent = findViewById(R.id.btn22);
        mark   = findViewById(R.id.btn);
        mdatabasereference = FirebaseDatabase.getInstance().getReference();

        mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mname = name.getText().toString();
                mdatabasereference.child(mname).setValue("present");
                Toast.makeText(MainActivity.this, "Attendance Marked", Toast.LENGTH_SHORT).show();

            }
        });

       absent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mname = name.getText().toString();
                mdatabasereference.child(mname).setValue("Absent");
                Toast.makeText(MainActivity.this, "Attendance Marked", Toast.LENGTH_SHORT).show();

            }
        });


    }
}