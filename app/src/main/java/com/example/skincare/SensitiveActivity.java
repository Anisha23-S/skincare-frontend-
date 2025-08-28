package com.example.skincare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SensitiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_sensitive);

        ImageView imgBack = findViewById(R.id.btn_back);

        imgBack.setOnClickListener(v -> {
            // This will take you back to the previous screen
            onBackPressed();
        });

        Button btSkin = findViewById(R.id. btn_add_to_routine);
        btSkin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                // Create an Intent to start MainActivity
                Intent intent = new Intent(SensitiveActivity.this, SecondRoutineActivity.class);
                startActivity(intent);

            }
        });
    }
}