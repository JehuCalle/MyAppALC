package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {

    private Button BtnHabita2,BtnRegresarHtel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        BtnHabita2 = (Button) findViewById(R.id.BtnHabita2);
        BtnRegresarHtel1 = (Button) findViewById(R.id.BtnRegresarHtel1);

        BtnHabita2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON HABITACION 2
                Intent Intent15 = new Intent(MainActivity9.this,MainActivity9.class);
                startActivity(Intent15);
            }
        });

        BtnRegresarHtel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity9.this,MainActivity8.class);
                startActivity(Intent16);
            }
        });
    }
}