package com.example.transportationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMobil extends AppCompatActivity {
    Button btnMobil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mobil);
        btnMobil=(Button) findViewById(R.id.btn_mobil);

        btnMobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnMobil = new Intent(ActivityMobil.this,Mobil.class);
                startActivity(pindahBtnMobil);
            }
        });
    }
}