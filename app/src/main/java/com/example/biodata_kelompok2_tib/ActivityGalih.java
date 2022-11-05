package com.example.biodata_kelompok2_tib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityGalih extends AppCompatActivity {

    ImageButton imageButtonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galih);

        imageButtonBack = (ImageButton) findViewById(R.id.backButtonGalih);

        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityGalih.this, MainActivity.class));
            }
        });
    }
}