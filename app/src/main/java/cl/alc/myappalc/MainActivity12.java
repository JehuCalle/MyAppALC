package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity12 extends AppCompatActivity {

    private Button BtnHtel2Piso2,BtnRegresarHtel2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        BtnHtel2Piso2 = (Button) findViewById(R.id.BtnHtel2Piso2);
        BtnRegresarHtel2 = (Button) findViewById(R.id.BtnRegresarHtel2);

        BtnHtel2Piso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON PISO 2
                Intent Intent13 = new Intent(MainActivity12.this,MainActivity13.class);
                startActivity(Intent13);
            }
        });

        BtnRegresarHtel2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent14 = new Intent(MainActivity12.this,MainActivity10.class);
                startActivity(Intent14);
            }
        });
    }
}