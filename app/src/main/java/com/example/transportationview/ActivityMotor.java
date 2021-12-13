package com.example.transportationview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityMotor extends AppCompatActivity {
    Button btnmotor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motor);
        btnmotor=(Button) findViewById(R.id.btn_motor);

        btnmotor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahBtnMotor = new Intent(ActivityMotor.this,Motor.class);
                startActivity(pindahBtnMotor);
            }
        });
    }
}