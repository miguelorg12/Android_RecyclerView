package com.example.practica_recyclerview.Adapters;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.practica_recyclerview.Models.Carro;
import com.example.practica_recyclerview.R;
import java.util.List;

public class CarroAdapter extends RecyclerView.Adapter<CarroAdapter.viewHolder> implements View.OnClickListener {
    List<Carro> Lista_Carros;
    private View.OnClickListener listener;
    public CarroAdapter(List<Carro> lista_carros){
        Lista_Carros = lista_carros;
    }

    @NonNull
    @Override
    public CarroAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater ly = LayoutInflater.from(parent.getContext());
        View v = ly.inflate(R.layout.itemcarro, parent, false);
        v.setOnClickListener(this);
        return new viewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CarroAdapter.viewHolder holder, int position) {
        Carro c = Lista_Carros.get(position);
        holder.setData(c);
    }
    @Override
    public int getItemCount() {
        return Lista_Carros.size();
    }
    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        if(listener!=null){
            listener.onClick(v);
        }
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        ImageView imgCarro;
        TextView txtMarca,txtModelo, txtColor;
        Carro cp;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            txtMarca = itemView.findViewById(R.id.txtmarca);
            txtModelo = itemView.findViewById(R.id.txtmodelo);
            imgCarro = itemView.findViewById(R.id.imgcarro);
        }
        public void setData(Carro c) {
            cp = c;
            imgCarro.setColorFilter(Color.parseColor(c.getColor()), PorterDuff.Mode.SRC_IN);
            txtMarca.setText(c.getMarca());
            txtModelo.setText(c.getModelo());
        }

    }
}
