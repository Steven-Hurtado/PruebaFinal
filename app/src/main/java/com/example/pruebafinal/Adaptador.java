package com.example.pruebafinal;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

class Adaptador extends ArrayAdapter<Paises> {

    public Adaptador(Context context, List<Paises> datos) {
        super(context, R.layout.ly_paises, datos);
    }
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater adap = LayoutInflater.from(getContext());
            View item = adap.inflate(R.layout.ly_paises, null);
            TextView lblTitulo = (TextView)item.findViewById(R.id.tvNombrePais);
            lblTitulo.setText("Nombre: "+getItem(position).getNombres()+"");
            ImageView img = (ImageView) item.findViewById(R.id.img);
            Glide.with(this.getContext()).load("http://www.geognos.com/api/en/countries/flag/"+getItem(position).getCodigoISO()+".png").into(img);
            return(item);
        }
    }

