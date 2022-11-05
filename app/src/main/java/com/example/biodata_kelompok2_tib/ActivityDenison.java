package com.example.biodata_kelompok2_tib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ActivityDenison extends AppCompatActivity {

    ImageButton imageButtonBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_denison);

        imageButtonBack = (ImageButton) findViewById(R.id.backButtonDenison);

        imageButtonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ActivityDenison.this, MainActivity.class));
            }
        });
    }
}