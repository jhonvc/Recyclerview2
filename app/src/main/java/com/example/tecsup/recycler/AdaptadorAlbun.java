package com.example.tecsup.recycler;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;

import java.util.List;

public class AdaptadorAlbun extends RecyclerView.Adapter<itemholder> {
    List<albun>datos;
    LayoutInflater layoutInflater;
    Context context;
    public AdaptadorAlbun(List<albun> datos, Context context){
        layoutInflater = LayoutInflater.from(context);
        this.datos=datos;
        this.context=context;

    }

    @NonNull
    @Override
    public itemholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = layoutInflater.inflate(R.layout.item_grupo,parent,false);
        return new itemholder(v,this);

    }

    @Override
    public void onBindViewHolder(@NonNull itemholder holder, int position) {
        holder.titulo.setText(datos.get(position).getTitulo());
        holder.fecha.setText(datos.get(position).fecha_lanzamiento);
        Glide.with(context).load(datos.get(position).getImagen()).into(holder.imageView);
        if (datos.get(position).favorito){

            Glide.with(context).load(R.drawable.ic_add_black_24dp).into(holder.favoritos);
        }else{
    Glide.with(context).load(R.drawable.ic_more_vert_black_24dp).into(holder.favoritos);
        }


        

    }

    @Override
    public int getItemCount() {
        return datos.size();
    }
    public  void changeFavorito(int i){
        datos.get(i).favorito=!datos.get(i).favorito;
        notifyDataSetChanged();
    }

}
