package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity7 extends AppCompatActivity {

    private Button BtnRegresarHostales,BtnReservarHtal1,BtnLocalizarHtal1,BtnCalificarHtal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);

        BtnRegresarHostales = (Button) findViewById(R.id.BtnRegresarHostales);
        BtnReservarHtal1 = (Button) findViewById(R.id.BtnReservarHtal1);
        BtnLocalizarHtal1 = (Button) findViewById(R.id.BtnLocalizarHtal1);
        BtnCalificarHtal1 = (Button) findViewById(R.id.BtnCalificarHtal1);

        BtnRegresarHostales.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON INICIO HOSTALES
                Intent Intent12 = new Intent(MainActivity7.this,MainActivity5.class);
                startActivity(Intent12);
            }
        });

        BtnReservarHtal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON RESERVAR
                Intent Intent11 = new Intent(MainActivity7.this,MainActivity15.class);
                startActivity(Intent11);
            }
        });

        BtnLocalizarHtal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON LOCALIZAR
                Intent Intent17 = new Intent(MainActivity7.this,MainMapaHostal1.class);
                startActivity(Intent17);
            }
        });

        BtnCalificarHtal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON CALIFICAR
                Intent Intent18 = new Intent(MainActivity7.this,MainActivity17.class);
                startActivity(Intent18);
            }
        });
    }
}