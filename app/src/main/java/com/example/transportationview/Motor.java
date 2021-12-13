package com.example.transportationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Motor extends AppCompatActivity {
    Button btnbackMotor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor2);
        btnbackMotor=(Button) findViewById(R.id.btn_motor2);

        btnbackMotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnBackMotor = new Intent(Motor.this,MainActivity.class);
                startActivity(pindahBtnBackMotor);
            }
        });
    }
}