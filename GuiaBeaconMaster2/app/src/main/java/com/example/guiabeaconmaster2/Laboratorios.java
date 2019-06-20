package com.example.guiabeaconmaster2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class Laboratorios extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laboratorios);

        CardView sis = (CardView) findViewById(R.id.cardLabosistemas);
        CardView fis = (CardView) findViewById(R.id.cardLabofisica);
        CardView qui = (CardView) findViewById(R.id.cardLaboquimica);
        CardView rob = (CardView) findViewById(R.id.cardLaborobotica);

        sis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Laboratorios.this,Ambsistemas.class);
                Laboratorios.this.startActivity(int1);
            }
        });
        fis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Laboratorios.this,Ambfisica.class);
                Laboratorios.this.startActivity(int1);
            }
        });

        qui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Laboratorios.this,Ambquimica.class);
                Laboratorios.this.startActivity(int1);
            }
        });

        rob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent int1 = new Intent(Laboratorios.this,Ambrobotica.class);
                Laboratorios.this.startActivity(int1);
            }
        });







    }
}
