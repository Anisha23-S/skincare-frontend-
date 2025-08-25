package com.example.skincare;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;


public class WelcomeScreenActivity extends AppCompatActivity {

    private static final int SPLASH_DURATION = 3000; // 3 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_welcome_screen);

        ImageView skinLogo = findViewById(R.id.SkinCare);
        TextView skinText = findViewById(R.id.skinText);

        // Animation for ImageView (move in and fade out)
        ObjectAnimator logoTranslationAnimator = ObjectAnimator.ofFloat(skinLogo, "translationY", -200f, 0f);
        ObjectAnimator logoAlphaAnimator = ObjectAnimator.ofFloat(skinLogo, "alpha", 0f, 1f);
        logoTranslationAnimator.setDuration(1000);
        logoAlphaAnimator.setDuration(1000);

        // Animation for TextView (scale up and fade in)
        ObjectAnimator textScaleXAnimator = ObjectAnimator.ofFloat(skinText, "scaleX", 0.5f, 1f);
        ObjectAnimator textScaleYAnimator = ObjectAnimator.ofFloat(skinText, "scaleY", 0.5f, 1f);
        ObjectAnimator textAlphaAnimator = ObjectAnimator.ofFloat(skinText, "alpha", 0f, 1f);
        textScaleXAnimator.setDuration(1000);
        textScaleYAnimator.setDuration(1000);
        textAlphaAnimator.setDuration(1000);

        // Combine both animations into a set
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(logoTranslationAnimator, logoAlphaAnimator, textScaleXAnimator, textScaleYAnimator, textAlphaAnimator);
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        animatorSet.start();

        // Start login activity after SPLASH_DURATION milliseconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(WelcomeScreenActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        }, SPLASH_DURATION);

    }
}
