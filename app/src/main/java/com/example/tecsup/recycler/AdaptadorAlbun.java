package com.example.tecsup.recycler;

import android.content.ClipData;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class AdaptadorAlbun extends RecyclerView.Adapter<itemholder> {
    List<albun>datos;
    LayoutInflater LayoutInflater;
    Context context;
    public AdaptadorAlbun(List<albun>datos, Context context){
        LayoutInflater= android.view.LayoutInflater.from(context);
        this.datos=datos;
        this.context=context;
    }


    @NonNull
    @Override
    public itemholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v=LayoutInflater.inflate(R.layout.item_grupo,parent,false);
        return new itemholder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull itemholder holder, int position) {
        

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
