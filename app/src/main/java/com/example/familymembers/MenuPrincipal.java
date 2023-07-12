package com.example.familymembers;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class MenuPrincipal extends AppCompatActivity {

    private ImageView imageViewFamilias;
    private ImageView imageViewFamiliares;
    private ActionBar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainmenu);

        imageViewFamilias = findViewById(R.id.imageViewFamilias);
        imageViewFamiliares = findViewById(R.id.imageViewFamiliares);

        toolbar = getSupportActionBar();
        toolbar.setTitle(R.string.MenuPrincipal);

        imageViewFamilias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
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
            private void navigateToFamiliares() {
                Intent intent = new Intent(MenuPrincipal.this, MenuFamiliares.class);
                startActivity(intent);
            }
        });

    }
}
