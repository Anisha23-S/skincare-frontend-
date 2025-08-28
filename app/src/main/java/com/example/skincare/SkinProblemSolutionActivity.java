package com.example.skincare;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SkinProblemSolutionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_skin_problem_solution);

        ImageView blackheads = findViewById(R.id.blackheads);

        blackheads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to NextActivity
                Intent intent = new Intent(SkinProblemSolutionActivity.this, BlackHeadsActivity.class);
                startActivity(intent);
            }
        });

        ImageView acne = findViewById(R.id.acne);

        acne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to NextActivity
                Intent intent = new Intent(SkinProblemSolutionActivity.this, AcneActivity.class);
                startActivity(intent);
            }
        });


        ImageView sensitive = findViewById(R.id.sensitive);

        sensitive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to NextActivity
                Intent intent = new Intent(SkinProblemSolutionActivity.this, SensitiveActivity.class);
                startActivity(intent);
            }
        });

        ImageView pigment = findViewById(R.id.pigment);

        pigment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to NextActivity
                Intent intent = new Intent(SkinProblemSolutionActivity.this, PigmentSpotActivity.class);
                startActivity(intent);
            }
        });


        ImageView imgBack = findViewById(R.id.btn_back);

        imgBack.setOnClickListener(v -> {
            // This will take you back to the previous screen
            onBackPressed();
        });
    }
}