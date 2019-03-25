package com.b.dentes3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pprincipal extends AppCompatActivity {
    private Button btnCita,btnInfoPersonal,btnHistorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pprincipal);

        btnCita= (Button) findViewById(R.id.buttonCita);
        btnInfoPersonal= (Button) findViewById(R.id.buttonInfoPersonal);
        btnHistorial= (Button) findViewById(R.id.buttonHistorial);
        btnHistorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Pprincipal.this,Historial.class);
                startActivity(intent);
            }
        });



        btnCita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Pprincipal.this,AgendarCita.class);
                startActivity(intent);
            }
        });
    }
}

