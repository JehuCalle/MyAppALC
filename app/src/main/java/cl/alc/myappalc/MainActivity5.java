package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity5 extends AppCompatActivity {
    private Button BtnHostalesInicio,BtnHostal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        BtnHostalesInicio = (Button) findViewById(R.id.BtnHostalesInicio);
        BtnHostal1 = (Button) findViewById(R.id.BtnHostal1);

        BtnHostalesInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON INICIO HOTELES
                Intent Intent8 = new Intent(MainActivity5.this,MainActivity2.class);
                startActivity(Intent8);
            }
        });

        BtnHostal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON PRIMER HOSTAL
                Intent Intent13 = new Intent(MainActivity5.this,MainActivity7.class);
                startActivity(Intent13);
            }
        });
    }
}