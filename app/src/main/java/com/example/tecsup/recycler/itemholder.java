package com.example.tecsup.recycler;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class itemholder  extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView titulo;
    TextView fecha;
    ImageView opciones;
    ImageView favoritos;
    AdaptadorAlbun adaptadorAlbun;
    int posicion;

    public itemholder(@NonNull View itemView, final AdaptadorAlbun adaptador) {
        super(itemView);
        imageView=itemView.findViewById(R.id.image_view);
        titulo=itemView.findViewById(R.id.titulo);
        fecha=itemView.findViewById(R.id.fecha);
        favoritos=itemView.findViewById(R.id.favorito);
        opciones=itemView.findViewById(R.id.opciones);
        favoritos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adaptadorAlbun.changeFavorito(posicion);
            }
        });



    }
}
