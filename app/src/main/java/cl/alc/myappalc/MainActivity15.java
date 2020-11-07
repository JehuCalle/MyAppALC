package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity15 extends AppCompatActivity {

    private Button BtnHtal1Piso2,BtnRegresarHtal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main15);

        BtnHtal1Piso2 = (Button) findViewById(R.id.BtnHtal1Piso2);
        BtnRegresarHtal1 = (Button) findViewById(R.id.BtnRegresarHtal1);

        BtnHtal1Piso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON PISO 2
                Intent Intent13 = new Intent(MainActivity15.this,MainActivity16.class);
                startActivity(Intent13);
            }
        });

        BtnRegresarHtal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent14 = new Intent(MainActivity15.this,MainActivity7.class);
                startActivity(Intent14);
            }
        });
    }
}