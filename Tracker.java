package com.example.donotgogentle.way;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Tracker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tracker);
        Intent intent = getIntent();
        String number = intent.getStringExtra("ID");
        Toast.makeText(Tracker.this,number.toString(),Toast.LENGTH_LONG);
    }
}
