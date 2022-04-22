package com.example.testevacina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Gestante extends AppCompatActivity {

    ImageView btnVoltarGestante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gestante);

        btnVoltarGestante = findViewById(R.id.btnVoltarGestante);
        btnVoltarGestante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.mover_esquerda, R.anim.fade_out);
            }
        });
    }
}