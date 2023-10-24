package com.example.practica_recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DetalleCarro extends AppCompatActivity {
    TextView marca, modelo;
    RelativeLayout fondo;

    Button btnregresar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_carro);
        Bundle bundle = getIntent().getExtras();
        String marca = bundle.getString("marca");
        String modelo = bundle.getString("modelo");
        String color = bundle.getString("color");
        this.marca = findViewById(R.id.txtmarca);
        this.modelo = findViewById(R.id.txtmodelo);
        this.fondo = findViewById(R.id.padre);
        this.marca.setText(marca);
        this.modelo.setText(modelo);
        this.fondo.setBackgroundColor(android.graphics.Color.parseColor(color));
        btnregresar = findViewById(R.id.btnregresar);
        btnregresar.setOnClickListener(v -> {
            Intent i = new Intent(this, MainActivity.class);
            startActivity(i);
        });
    }
}