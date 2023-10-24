package com.example.practica_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import com.example.practica_recyclerview.Adapters.CarroAdapter;
import com.example.practica_recyclerview.Models.Carro;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main);
        List<Carro> lista_carros = new ArrayList<>();
        lista_carros.add(new Carro("#CB3234", "F50", "Toyota"));
        lista_carros.add(new Carro("#0000FF", "C4", "Honda"));
        lista_carros.add(new Carro("#008000", "Cayenne", "Nissan"));
        lista_carros.add(new Carro("#FFA500", "Mustang", "Ford"));
        lista_carros.add(new Carro("#800080", "Civic", "Honda"));
        lista_carros.add(new Carro("#FF0000", "Corolla", "Toyota"));
        lista_carros.add(new Carro("#00FF00", "Accord", "Honda"));
        lista_carros.add(new Carro("#FFD700", "Explorer", "Ford"));
        lista_carros.add(new Carro("#4B0082", "Tucson", "Hyundai"));
        CarroAdapter adapter = new CarroAdapter(lista_carros);
        RecyclerView rec = findViewById(R.id.rvcarros);
        adapter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), DetalleCarro.class);
                intent.putExtra("marca", lista_carros.get(rec.getChildAdapterPosition(v)).getMarca());
                intent.putExtra("modelo", lista_carros.get(rec.getChildAdapterPosition(v)).getModelo());
                intent.putExtra("color", lista_carros.get(rec.getChildAdapterPosition(v)).getColor());
                startActivity(intent);
            }
        });
        rec.setAdapter(adapter);
        rec.setLayoutManager(new LinearLayoutManager(this));

    }
}