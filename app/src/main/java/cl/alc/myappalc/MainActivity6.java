package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity6 extends AppCompatActivity {

    private Button BtnRegresarHoteles,BtnReservarHtel1,BtnLocalizarHtel1,btnCalificarHtel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        BtnRegresarHoteles = (Button) findViewById(R.id.BtnRegresarHoteles);
        BtnReservarHtel1 = (Button) findViewById(R.id.BtnReservarHtel1);
        BtnLocalizarHtel1 = (Button) findViewById(R.id.BtnLocalizarHtel1);
        btnCalificarHtel1 = (Button) findViewById(R.id.btnCalificarHtel1);

        BtnRegresarHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON INICIO HOTELES
                Intent Intent11 = new Intent(MainActivity6.this,MainActivity4.class);
                startActivity(Intent11);
            }
        });

        BtnReservarHtel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON RESERVAR
                Intent Intent11 = new Intent(MainActivity6.this,MainActivity8.class);
                startActivity(Intent11);
            }
        });

        BtnLocalizarHtel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON LOCALIZAR
                Intent Intent17 = new Intent(MainActivity6.this,MainActivity10.class);
                startActivity(Intent17);
            }
        });

        btnCalificarHtel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON LOCALIZAR
                Intent Intent18 = new Intent(MainActivity6.this,MainActivity11.class);
                startActivity(Intent18);
            }
        });
    }
}