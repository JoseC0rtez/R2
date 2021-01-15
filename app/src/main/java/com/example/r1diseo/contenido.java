package com.example.r1diseo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class contenido extends AppCompatActivity implements comunica_menu {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contenido);
    }

    @Override
    public void menu(int q_boton) {
        Intent in=new Intent (this,content_Crud.class);
        in.putExtra("BOTONPULSADO",q_boton);
        startActivity(in);
    }
}