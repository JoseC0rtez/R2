package com.example.r1diseo;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter {
ArrayList<contacto> lista;
DaoContacto dao;
contacto c;
Activity a;
public Adaptador(ArrayList<contacto>lista, Activity a, DaoContacto dao){
    this.lista=lista;
    this.dao=dao;
    this.c=c;
    this.a=a;
}

    @Override
    public int getCount() {
        return lista.size();
    }

    @Override
    public Object getItem(int i) {
    c=lista.get(i);
    return null;
    }

    @Override
    public long getItemId(int i) {
        c=lista.get(i);
        return c.getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
    View v=view;
    if(v!=null){
        LayoutInflater li=(LayoutInflater) a.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v=li.inflate(R.layout.modificar,null);
    }
        c=lista.get(i);
        EditText nombre=(EditText)v.findViewById(R.id.editTextSaveNombre);
        EditText apellido=(EditText)v.findViewById(R.id.editTextSaveApellido);
        EditText telefono=(EditText)v.findViewById(R.id.editTextSaveTelefono);

        return null;
    }
}
