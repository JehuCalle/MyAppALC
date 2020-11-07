package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity19 extends AppCompatActivity {

    private Button BtnHtal2Piso2,BtnRegresarHtal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main19);

        BtnHtal2Piso2 = (Button) findViewById(R.id.BtnHtal2Piso2);
        BtnRegresarHtal2 = (Button) findViewById(R.id.BtnRegresarHtal2);

        BtnHtal2Piso2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON PISO 2
                Intent Intent35 = new Intent(MainActivity19.this,MainActivity20.class);
                startActivity(Intent35);
            }
        });

        BtnRegresarHtal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent36 = new Intent(MainActivity19.this,MainActivity18.class);
                startActivity(Intent36);
            }
        });
    }
}