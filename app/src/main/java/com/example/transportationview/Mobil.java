package com.example.transportationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Mobil extends AppCompatActivity {
    Button btnBackMobil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil2);
        btnBackMobil=(Button) findViewById(R.id.btn_mobil2);

        btnBackMobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnBackMobil = new Intent(Mobil.this,MainActivity.class);
                startActivity(pindahBtnBackMobil);
            }
        });


    }
}