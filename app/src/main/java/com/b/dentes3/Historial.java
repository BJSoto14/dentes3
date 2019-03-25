package com.b.dentes3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;

import com.b.dentes3.Objetos.Adaptador;
import com.b.dentes3.Objetos.Historial_Obj;

import java.util.ArrayList;

public class Historial extends AppCompatActivity {

    ArrayList<Historial_Obj> listaHistory;
    RecyclerView recyclerView;
    private ImageButton btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);
        btnAceptar= (ImageButton) findViewById(R.id.imageButtonAcept);

        listaHistory= new ArrayList<>();
        recyclerView= (RecyclerView) findViewById(R.id.Recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        llenarhistorial();
        Adaptador adaptador= new Adaptador(listaHistory);
        recyclerView.setAdapter(adaptador);
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(Historial.this,Pprincipal.class);
                startActivity(intent);
            }
        });
    }

    public void llenarhistorial(){
        listaHistory.add(new Historial_Obj("Limpieza","12/09/2019","12:30","250",R.drawable.limpieza));
        listaHistory.add(new Historial_Obj("Brakets","29/10/2019","2:30","350",R.drawable.brakets));
        listaHistory.add(new Historial_Obj("Limpieza","12/12/2019","5:15","150",R.drawable.corona));
        listaHistory.add(new Historial_Obj("Limpieza","07/06/2019","1:40","100",R.drawable.chequeo));
    }
}
