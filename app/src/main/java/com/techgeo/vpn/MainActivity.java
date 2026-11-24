package com.techgeo.vpn;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    TextView estado;
    Button conectar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout pantalla = new LinearLayout(this);
        pantalla.setOrientation(1);
        pantalla.setGravity(Gravity.CENTER);
        pantalla.setPadding(25,25,25,25);
        pantalla.setBackgroundColor(Color.rgb(10,15,28));

        TextView titulo = new TextView(this);
        titulo.setText("TECHGEO VPN");
        titulo.setTextSize(30);
        titulo.setTextColor(Color.CYAN);
        titulo.setGravity(Gravity.CENTER);

        estado = new TextView(this);
        estado.setText("\nDESCONECTADO\n");
        estado.setTextSize(18);
        estado.setTextColor(Color.WHITE);
        estado.setGravity(Gravity.CENTER);

        conectar = new Button(this);
        conectar.setText("CONECTAR");

        conectar.setOnClickListener(v -> {
            Toast.makeText(this,
                "Configuración de conexión pendiente",
                Toast.LENGTH_SHORT).show();
        });

        pantalla.addView(titulo);
        pantalla.addView(estado);
        pantalla.addView(conectar);

        setContentView(pantalla);
    }
}
