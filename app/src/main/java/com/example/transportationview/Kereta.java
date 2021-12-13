package com.example.transportationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kereta extends AppCompatActivity {
    Button btnBackKereta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kereta2);
        btnBackKereta=(Button) findViewById(R.id.btn_kereta2);

        btnBackKereta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnBackKereta = new Intent(Kereta.this,MainActivity.class);
                startActivity(pindahBtnBackKereta);

            }
        });

    }
}