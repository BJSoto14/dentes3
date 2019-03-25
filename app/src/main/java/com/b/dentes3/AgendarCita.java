package com.b.dentes3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class AgendarCita extends AppCompatActivity {
    private ImageButton btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agendar_cita);

        btnAceptar= (ImageButton) findViewById(R.id.imageButtonAceptar);

        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(AgendarCita.this,Pprincipal.class);
                startActivity(intent);
            }
        });
    }
}
