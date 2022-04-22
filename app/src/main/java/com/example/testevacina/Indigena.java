package com.example.testevacina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Indigena extends AppCompatActivity {

    ImageView btnVoltarIndigena;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indigena);

        btnVoltarIndigena = findViewById(R.id.btnVoltarIndigena);
        btnVoltarIndigena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.mover_esquerda, R.anim.fade_out);
            }
        });
    }
}