package com.example.ex9imageturn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button btn;
    private ImageView img;
    private int degree = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setIcon(R.drawable.ic_launcher_foreground);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btn = findViewById(R.id.btn);
        img = findViewById(R.id.img);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                degree -= 45;
                img.setRotation(degree);
            }
        });

    }
}