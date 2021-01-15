package com.example.r1diseo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.app.Fragment;
//import androidx.fragment.app.Fragment;

public class insertar extends Fragment {

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.insertar, container, false);
    }
    public void insertar() {
        // Required empty public constructor
    }
}