package com.example.transportationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityKereta extends AppCompatActivity {
    Button btnKereta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kereta);
        btnKereta=(Button) findViewById(R.id.btn_kereta);

        btnKereta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnKereta = new Intent(ActivityKereta.this,Kereta.class);
                startActivity(pindahBtnKereta);
            }
        });
    }
}