package com.example.guiabeaconmaster2.interfaz;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.guiabeaconmaster2.Activitys.Login;
import com.example.guiabeaconmaster2.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashActivity.this, Login.class);
                startActivity(intent);
                finish();

            }
        },5000);
    }
}
