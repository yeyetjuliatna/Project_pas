package com.example.transportationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityPesawat extends AppCompatActivity {
    Button btnPesawat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesawat);
        btnPesawat=(Button) findViewById(R.id.btn_pesawat);

        btnPesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnPesawat = new Intent(ActivityPesawat.this,Pesawat.class);
                startActivity(pindahBtnPesawat);
            }
        });
    }
}