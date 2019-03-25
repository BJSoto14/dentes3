package com.b.dentes3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.util.HashMap;
import java.util.Map;

public class Registro extends AppCompatActivity {
    EditText ednombre, edape, dia,mes,año, edcor, edcon;
    Button btn_Registrar;
    String FechaNacimiento;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);
        ednombre =(EditText)findViewById(R.id.txtnom);
        edape = (EditText) findViewById(R.id.txtape);
        dia = (EditText) findViewById(R.id.editTextDia);
        mes= (EditText) findViewById(R.id.editTextMes);
        año= (EditText) findViewById(R.id.editTextAño);
        edcor = (EditText) findViewById(R.id.txtUser);
        edcon = (EditText) findViewById(R.id.txtcon);


        btn_Registrar = (Button) findViewById(R.id.b_Aceptar);
        btn_Registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            ejecutarServicio("http://dentes3.hostingerapp.com/Register.php");
            }
        });
    }

    private void ejecutarServicio(String URL) {
        if(dia!=null&&mes!=null&&año!=null){
            FechaNacimiento= dia.getText().toString() + mes.getText().toString() + año.getText().toString();
        }
        StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                Toast.makeText(getApplicationContext(), "Operacion Exitosa", Toast.LENGTH_SHORT).show();
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(getApplicationContext(), error.toString(), Toast.LENGTH_SHORT).show();
            }
        }) {

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                Map<String, String> parametros = new HashMap<String, String>();
                parametros.put("nombres", ednombre.getText().toString());
                parametros.put("apellidos", edape.getText().toString());
                parametros.put("fecha", FechaNacimiento);
                parametros.put("correo", edcor.getText().toString());
                parametros.put("contraseña", edcon.getText().toString());

                return parametros;
            }
        };
        RequestQueue requestQueue = Volley.newRequestQueue(this);
        requestQueue.add(stringRequest);
    }
}
