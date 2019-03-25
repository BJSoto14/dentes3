package com.b.dentes3.Objetos;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.b.dentes3.R;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.ViewHolderHistorial> {

    ArrayList<Historial_Obj> ListaHistorial;

    public Adaptador(ArrayList<Historial_Obj> listaHistorial) {
        ListaHistorial = listaHistorial;
    }

    @NonNull
    @Override
    public ViewHolderHistorial onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.historial_layout,null,false);

        return new ViewHolderHistorial(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderHistorial viewHolderHistorial, int i) {

        viewHolderHistorial.titulo.setText(ListaHistorial.get(i).getTitulo());
        viewHolderHistorial.fecha.setText(ListaHistorial.get(i).getFecha());
        viewHolderHistorial.hora.setText(ListaHistorial.get(i).getHora());
        viewHolderHistorial.precio.setText(ListaHistorial.get(i).getPrecio());
        viewHolderHistorial.imagen.setImageResource(ListaHistorial.get(i).getFoto());

    }

    @Override
    public int getItemCount() {
        return ListaHistorial.size();
    }

    public class ViewHolderHistorial extends RecyclerView.ViewHolder{
        TextView titulo,fecha,hora,precio;
        ImageView imagen;


        public ViewHolderHistorial(@NonNull View itemView) {
            super(itemView);
            titulo= (TextView) itemView.findViewById(R.id.textViewTitulo);
            fecha= (TextView) itemView.findViewById(R.id.textViewFecha);
            hora= (TextView) itemView.findViewById(R.id.textViewHora);
            precio= (TextView) itemView.findViewById(R.id.textViewPrecio);
            imagen= (ImageView) itemView.findViewById(R.id.imageViewImagen);

        }
    }
}
