package com.example.crud_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Context context;
    Button btnListar, btnRegistrar, btnBuscar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void init(){
        context = getApplicationContext();
        btnRegistrar = findViewById(R.id.btnregistrar);
        btnBuscar = findViewById(R.id.btnbuscar);
        btnListar = findViewById(R.id.btnlistar);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnregistrar) {
            Toast.makeText(this, "Registrar", Toast.LENGTH_LONG).show();
            Intent i = new Intent(this, GestionarLibroActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.btnlistar) {
            Toast.makeText(this, "Listar", Toast.LENGTH_LONG).show();
            Intent i2 = new Intent(this, GestionarLibroActivity.class);
            startActivity(i2);
        } else if (v.getId() == R.id.btnbuscar) {
            Toast.makeText(this, "Buscar", Toast.LENGTH_LONG).show();
            Intent i3 = new Intent(this, GestionarLibroActivity.class);
            startActivity(i3);
        }
    }

}