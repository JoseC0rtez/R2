package com.example.r1diseo;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
//import androidx.fragment.app.Fragment;

public class content_Crud extends AppCompatActivity implements comunica_menu {
Fragment[] MisFragmentos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crud);
        MisFragmentos =new Fragment[3];
        MisFragmentos[0]= new insertar();
        MisFragmentos[1]= new listado();
        MisFragmentos[2]= new modificar();

        Bundle extras=getIntent().getExtras();
        menu(extras.getInt("BOTONPULSADO"));
    }

    @Override
    public void menu(int q_boton) {
        FragmentManager miManejador=getFragmentManager();
        FragmentTransaction miTransaction=miManejador.beginTransaction();
        miTransaction.replace(R.id.crud, MisFragmentos[q_boton]);
        miTransaction.commit();

    }
}