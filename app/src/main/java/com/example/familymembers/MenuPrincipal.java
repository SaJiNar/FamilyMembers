package com.example.familymembers;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MenuPrincipal extends AppCompatActivity {

    private ImageView imageViewFamilias;
    private ImageView imageViewFamiliares;
    private TextView textViewFamilias;
    private TextView textViewFamiliares;
    private ActionBar toolbar;
    private ConstraintLayout container;
    private ConstraintLayout constraintLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        container = findViewById(R.id.constraintLayout);
        imageViewFamilias = findViewById(R.id.imageViewFamilias);
        imageViewFamiliares = findViewById(R.id.imageViewFamiliares);
        constraintLayout = findViewById(R.id.constraintLayout);
        textViewFamilias = findViewById(R.id.textViewFamilias);
        textViewFamiliares = findViewById(R.id.textViewFamiliares);

        toolbar = getSupportActionBar();
        toolbar.setTitle(R.string.MenuPrincipal);


        // Configurar el fondo animado
        final AnimationDrawable animationDrawable = (AnimationDrawable) container.getBackground();
        animationDrawable.setEnterFadeDuration(20000); // 20 segundos
        animationDrawable.setExitFadeDuration(3000); // 3 segundos
        animationDrawable.start();


        imageViewFamilias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToFamilias();
            }

            public void onFamiliasButtonClick (View view) {
                navigateToFamilias();
            }

            private void navigateToFamilias() {
                Intent intent = new Intent(MenuPrincipal.this, MenuFamilias.class);
                startActivity(intent);
            }
        });


        imageViewFamiliares.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToFamiliares();
            }

            public void onFamiliaresButtonClick(View view) {
                navigateToFamiliares();
            }

            private void navigateToFamiliares() {
                Intent intent = new Intent(MenuPrincipal.this, MenuFamiliares.class);
                startActivity(intent);
            }
        });

    }
}
