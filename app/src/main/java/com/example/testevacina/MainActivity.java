package com.example.testevacina;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.app.ActivityOptionsCompat;

import android.app.ActivityOptions;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView btnAdulto, btnGestante, btnIndigena, btnCreditos, imgUsc;
    TextView txtSobreVacina, txtSobreVacina2,txtSobreVacina3;
    LinearLayout layout, layout2, layout3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAdulto = findViewById(R.id.btnAdulto);
        btnGestante = findViewById(R.id.btnGestante);
        btnIndigena = findViewById(R.id.btnIndigena);
        btnCreditos = findViewById(R.id.btnCreditos);
        imgUsc = findViewById(R.id.imgUsc);

        txtSobreVacina = findViewById(R.id.txtSobreVacina);
        layout = findViewById(R.id.layout);
        txtSobreVacina2 = findViewById(R.id.txtSobreVacina2);
        layout2 = findViewById(R.id.layout2);
        txtSobreVacina3 = findViewById(R.id.txtSobreVacina3);
        layout3 = findViewById(R.id.layout3);


        imgUsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent usc = new Intent(Intent.ACTION_VIEW, Uri.parse("https://unisagrado.edu.br"));
                startActivity(usc);
            }
        });

        btnAdulto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent adulto = new Intent(getApplicationContext(), Adulto.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(MainActivity.this, adulto, activityOptionsCompat.toBundle());
                //startActivity(adulto);


            }
        });

        btnIndigena.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent indigena = new Intent(getApplicationContext(), Indigena.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(MainActivity.this, indigena, activityOptionsCompat.toBundle());
                //startActivity(indigena);
            }
        });
        btnGestante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gestante = new Intent(getApplicationContext(), Gestante.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(MainActivity.this, gestante, activityOptionsCompat.toBundle());
                //startActivity(gestante);
            }
        });

        btnCreditos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent creditos = new Intent(getApplicationContext(), Creditos.class);
                ActivityOptionsCompat activityOptionsCompat = ActivityOptionsCompat.makeCustomAnimation(getApplicationContext(),R.anim.fade_in, R.anim.mover_direita);
                ActivityCompat.startActivity(MainActivity.this, creditos, activityOptionsCompat.toBundle());
                //startActivity(creditos)
            }
        });
    }
    public void expand (View view){
        int v = (txtSobreVacina.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout, new AutoTransition());
        txtSobreVacina.setVisibility(v);

    }
    public void expand2 (View view){
        int v = (txtSobreVacina2.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout2, new AutoTransition());
        txtSobreVacina2.setVisibility(v);

    }
    public void expand3 (View view){
        int v = (txtSobreVacina3.getVisibility() == View.GONE)? View.VISIBLE: View.GONE;
        TransitionManager.beginDelayedTransition(layout3, new AutoTransition());
        txtSobreVacina3.setVisibility(v);

    }
}