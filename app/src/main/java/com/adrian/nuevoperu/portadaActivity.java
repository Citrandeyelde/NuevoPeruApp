package com.adrian.nuevoperu;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class portadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_portada);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Ir al MainActivity
                Intent intent = new Intent(portadaActivity.this, MainActivity.class);
                startActivity(intent);
                finish(); // Cierra el SplashActivity
            }
        }, 4000);

    }
}