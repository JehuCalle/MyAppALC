package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {

    private Button BtnRegresarHotel2,BtnReservarHotel2,BtnLocalizarHotel2,BtnCalificarHotel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        BtnRegresarHotel2 = (Button) findViewById(R.id.BtnRegresarHotel2);
        BtnReservarHotel2 = (Button) findViewById(R.id.BtnReservarHotel2);
        BtnLocalizarHotel2 = (Button) findViewById(R.id.BtnLocalizarHotel2);
        BtnCalificarHotel2 = (Button) findViewById(R.id.BtnCalificarHotel2);

        BtnRegresarHotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON INICIO HOTELES
                Intent Intent23 = new Intent(MainActivity10.this,MainActivity4.class);
                startActivity(Intent23);
            }
        });

        BtnReservarHotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON RESERVAR
                Intent Intent11 = new Intent(MainActivity10.this,MainActivity12.class);
                startActivity(Intent11);
            }
        });

        BtnLocalizarHotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON LOCALIZAR
                Intent Intent17 = new Intent(MainActivity10.this,MainMapaHotel2.class);
                startActivity(Intent17);
            }
        });

        BtnCalificarHotel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON CALIFICAR
                Intent Intent18 = new Intent(MainActivity10.this,MainActivity14.class);
                startActivity(Intent18);
            }
        });
    }
}