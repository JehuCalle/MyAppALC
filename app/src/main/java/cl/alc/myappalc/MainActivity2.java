package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button BtnCerrarSesion;
    private Button BtnHotel;
    private Button BtnHostal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        BtnCerrarSesion = (Button) findViewById(R.id.BtnCerrarSesion);
        BtnHotel = (Button) findViewById(R.id.BtnHotel);
        BtnHostal = (Button) findViewById(R.id.BtnHostal);

        BtnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON CERRAR SESION
                Intent Intent4 = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(Intent4);
            }
        });

        BtnHotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON VER HOTELES
                Intent Intent5 = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(Intent5);
            }
        });

        BtnHostal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON VER HOSTALES
                Intent Intent6 = new Intent(MainActivity2.this,MainActivity5.class);
                startActivity(Intent6);
            }
        });

        BtnCerrarSesion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON CERRAR SESION
                Intent Intent9 = new Intent(MainActivity2.this,MainActivity.class);
                startActivity(Intent9);
            }
        });
    }
}