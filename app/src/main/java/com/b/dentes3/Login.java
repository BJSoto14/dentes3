package com.b.dentes3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void sig (View view){
        Intent sig = new Intent(this,Registro.class);
        startActivity(sig);
    }
    public void princi (View view){
        Intent pric = new Intent(this,Pprincipal.class);
        startActivity(pric);
    }


}
