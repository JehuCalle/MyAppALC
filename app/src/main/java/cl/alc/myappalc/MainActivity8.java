package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends AppCompatActivity {

    private Button BtnHtel1Piso5,BtnRegresarHtel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        BtnHtel1Piso5 = (Button) findViewById(R.id.BtnHtel1Piso5);
        BtnRegresarHtel1 = (Button) findViewById(R.id.BtnRegresarHtel1);

        BtnHtel1Piso5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON PISO 5
                Intent Intent13 = new Intent(MainActivity8.this,MainActivity9.class);
                startActivity(Intent13);
            }
        });

        BtnRegresarHtel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent14 = new Intent(MainActivity8.this,MainActivity6.class);
                startActivity(Intent14);
            }
        });
    }
}