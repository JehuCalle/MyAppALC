package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity20 extends AppCompatActivity {

    private Button BtnRegresarHtal2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main20);

        BtnRegresarHtal2 = (Button) findViewById(R.id.BtnRegresarHtal2);

        BtnRegresarHtal2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent38 = new Intent(MainActivity20.this,MainActivity19.class);
                startActivity(Intent38);
            }
        });
    }
}