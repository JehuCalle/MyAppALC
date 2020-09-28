package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    private Button BtnHotelesInicio,BtnHotel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        BtnHotelesInicio = (Button) findViewById(R.id.BtnHotelesInicio);
        BtnHotel1 = (Button) findViewById(R.id.BtnHotel1);

        BtnHotelesInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON INICIO HOTELES
                Intent Intent7 = new Intent(MainActivity4.this,MainActivity2.class);
                startActivity(Intent7);
            }
        });

        BtnHotel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON PRIMER HOTEL
                Intent Intent10 = new Intent(MainActivity4.this,MainActivity6.class);
                startActivity(Intent10);
            }
        });
    }
}