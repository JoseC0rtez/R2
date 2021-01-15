package com.example.r1diseo;

import android.app.Activity;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


public class BlankFragment extends Fragment {
    private final int[] BOTONESMENU = {R.id.insertar, R.id.listado, R.id.modificar};

    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View mimenu = inflater.inflate(R.layout.fragment_blank, container, false);
        ImageButton botonmenu;
        for (int  i=0; i<BOTONESMENU.length;i++){
            botonmenu =(ImageButton) mimenu.findViewById(BOTONESMENU[i]);
            final int q_boton=i;
            botonmenu.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    Activity estaclase=getActivity();
                    ((comunica_menu)estaclase).menu(q_boton);
                }
            });
        }
        return mimenu;
    }
}