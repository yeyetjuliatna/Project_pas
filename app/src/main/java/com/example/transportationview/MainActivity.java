package com.example.transportationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {
    CircleImageView imgKereta,imgMobil,imgMotor,imgPesawat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgKereta=(CircleImageView) findViewById(R.id.kereta);
        imgMobil=(CircleImageView) findViewById(R.id.mobil);
        imgMotor=(CircleImageView) findViewById(R.id.motor);
        imgPesawat=(CircleImageView) findViewById(R.id.pesawat);


        imgKereta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahKereta = new Intent(MainActivity.this,ActivityKereta.class);
                startActivity(pindahKereta);
            }
        });
        imgMobil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahMobil = new Intent(MainActivity.this,ActivityMobil.class);
                startActivity(pindahMobil);
            }
        });
        imgMotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahMotor = new Intent(MainActivity.this,ActivityMotor.class);
                startActivity(pindahMotor);
            }
        });
        imgPesawat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahPesawat = new Intent(MainActivity.this,ActivityPesawat.class);
                startActivity(pindahPesawat);
            }
        });
    }
}