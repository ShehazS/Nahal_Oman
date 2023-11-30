package com.example.nahaloman;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class splashy extends AppCompatActivity {

    private static final int SPLASH_TIME_OUT = 2000; // 2 seconds
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashy);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start your main activity after the splash time out
                Intent i = new Intent(splashy.this, LoginPage.class);
                startActivity(i);

                // Close this activity
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}