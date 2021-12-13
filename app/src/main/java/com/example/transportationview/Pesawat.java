package com.example.transportationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pesawat extends AppCompatActivity {
    Button btnBackPesawat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesawat2);
        btnBackPesawat=(Button) findViewById(R.id.btn_pesawat2);

      btnBackPesawat.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent pindahBtnBackPesawat = new Intent(Pesawat.this,MainActivity.class);
              startActivity(pindahBtnBackPesawat);
          }
      });
    }
}