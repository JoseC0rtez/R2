package com.example.r1diseo;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;

public class DaoContacto {
    SQLiteDatabase cx;
    ArrayList<contacto>lista;
    contacto c;
    Context ct;
    String nombreDB="DBContactos";
    String tabla="create table if not exists contacto(id integer primary key autoincrement, nombre text, apellido text, telefono text)";

    public DaoContacto(Context c){
        this.ct=c;
        cx=c.openOrCreateDatabase(nombreDB,Context.MODE_WORLD_READABLE,null);
        cx.execSQL(tabla);
    }
public boolean insertar(contacto c){
        return true;
}
    public boolean eliminar(int id){
        return true;
    }
    public boolean editar(contacto c){
        return true;
    }

    public ArrayList<contacto> verTodos() {
        return lista;
    }
    public contacto verUno(int id){
        return c;
    }
}
