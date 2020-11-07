package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity18 extends AppCompatActivity {

    private Button BtnRegresarHostal2,BtnReservarHtal2,BtnLocalizarHtal2,BtnCalificarHtal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main18);

        BtnRegresarHostal2 = (Button) findViewById(R.id.BtnRegresarHostal2);
        BtnReservarHtal2 = (Button) findViewById(R.id.BtnReservarHtal2);
        BtnLocalizarHtal2 = (Button) findViewById(R.id.BtnLocalizarHtal2);
        BtnCalificarHtal2 = (Button) findViewById(R.id.BtnCalificarHtal2);

        BtnRegresarHostal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON INICIO HOSTALES
                Intent Intent31 = new Intent(MainActivity18.this,MainActivity5.class);
                startActivity(Intent31);
            }
        });

        BtnReservarHtal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON RESERVAR
                Intent Intent32 = new Intent(MainActivity18.this,MainActivity19.class);
                startActivity(Intent32);
            }
        });

        BtnLocalizarHtal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON LOCALIZAR
                Intent Intent33 = new Intent(MainActivity18.this,MainMapaHostal2.class);
                startActivity(Intent33);
            }
        });

        BtnCalificarHtal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON CALIFICAR
                Intent Intent34 = new Intent(MainActivity18.this,MainActivity21.class);
                startActivity(Intent34);
            }
        });
    }
}