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

public class CombinationSkinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_combination_skin);
        Button btSkin = findViewById(R.id.Skin_button);
        btSkin.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // Create an Intent to start MainActivity
            Intent intent = new Intent(CombinationSkinActivity.this, CombinationActivity.class);
            startActivity(intent);

        }
    });

    ImageView imgBack = findViewById(R.id.back_button);

        imgBack.setOnClickListener(v -> {
        // This will take you back to the previous screen
        onBackPressed();
    });
    }
}