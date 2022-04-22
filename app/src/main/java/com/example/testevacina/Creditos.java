package com.example.testevacina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Creditos extends AppCompatActivity {

    ImageView btnVoltarCreditos;
    TextView detailsText;
    LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditos);

        detailsText = findViewById(R.id.txtInfoIntegrantes);
        layout = findViewById(R.id.layout);

        btnVoltarCreditos = findViewById(R.id.btnVoltarCreditos);

        btnVoltarCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                overridePendingTransition(R.anim.mover_esquerda, R.anim.fade_out);
            }
        });

    }
    public void expand (View view){
        int v = (detailsText.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        detailsText.setVisibility(v);

    }

}