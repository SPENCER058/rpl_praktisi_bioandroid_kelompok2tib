package com.example.biodata_kelompok2_tib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton imageButtonGalih;
    ImageButton imageButtonAldi;
    ImageButton imageButtonFakhri;
    ImageButton imageButtonEricha;
    ImageButton imageButtonEnggina;
    ImageButton imageButtonDenison;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageButtonGalih = (ImageButton) findViewById(R.id.imagebtn_pp_galih);
        imageButtonAldi = (ImageButton) findViewById(R.id.imagebtn_pp_aldi);
        imageButtonFakhri = (ImageButton) findViewById(R.id.imagebtn_pp_fakhri);
        imageButtonEricha = (ImageButton) findViewById(R.id.imagebtn_pp_ericha);
        imageButtonEnggina = (ImageButton) findViewById(R.id.imagebtn_pp_enggina);
        imageButtonDenison = (ImageButton) findViewById(R.id.imagebtn_pp_denison);

        imageButtonGalih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityGalih.class));
            }
        });

        imageButtonAldi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityAldi.class));
            }
        });

        imageButtonFakhri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityFakhri.class));
            }
        });

        imageButtonEricha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityEricha.class));
            }
        });

        imageButtonEnggina.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityEnggina.class));
            }
        });

        imageButtonDenison.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ActivityDenison.class));
            }
        });
    }
}