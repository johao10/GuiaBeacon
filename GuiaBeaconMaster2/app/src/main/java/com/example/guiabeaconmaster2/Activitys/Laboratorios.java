package com.example.guiabeaconmaster2.Activitys;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.example.guiabeaconmaster2.R;

public class Laboratorios extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratorios);

        CardView sis = (CardView) findViewById(R.id.cardLabosis);
        CardView fis = (CardView) findViewById(R.id.cardLabofisi);
        CardView qui = (CardView) findViewById(R.id.cardLaboquimi);
        CardView rob = (CardView) findViewById(R.id.cardLaborobot);

        sis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Laboratorios.this, HorariosActivity.class);
                Laboratorios.this.startActivity(int1);
            }
        });
    }
}
