package com.example.tecsup.recycler;

import android.content.DialogInterface;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;

import java.util.LinkedList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    List<albun>data;
    AdaptadorAlbun adapter;
    FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycler_view);
        fab=findViewById(R.id.floating_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MostrarAlertCreacion();
            }
        });
        data=new LinkedList<>();
        data.add(new albun("megamix tonera 2019","2019","http://www.musicaq2.com/st.img/9FEcjZ8JIsu.jpg",false));

        AdaptadorAlbun adapter=new AdaptadorAlbun(data,MainActivity.this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));
    }
    public void MostrarAlertCreacion(){
        AlertDialog.Builder buider=new AlertDialog.Builder(MainActivity.this);
        buider.setTitle("Agregar titulo");
        buider.setMessage("Esta agregando nuevo");
        final View v = LayoutInflater.from(MainActivity.this).inflate(R.layout.albun_from,null);
        buider.setView(v);
        buider.setPositiveButton("Agregar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                EditText nombre=v.findViewById(R.id.et_nombre);
                EditText fecha=v.findViewById(R.id.et_fecha);
                EditText imagen=v.findViewById(R.id.et_imagen);
                data.add(new albun(nombre.getText().toString(),fecha.getText().toString(),imagen.getText().toString(),false));

            }
        });
        buider.show();
    }
}
