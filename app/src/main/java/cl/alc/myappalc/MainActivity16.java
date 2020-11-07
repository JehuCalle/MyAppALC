package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity16 extends AppCompatActivity {

    private Button btnRegresarHtal1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main16);

        btnRegresarHtal1 = (Button) findViewById(R.id.btnRegresarHtal1);

        btnRegresarHtal1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent16 = new Intent(MainActivity16.this,MainActivity7.class);
                startActivity(Intent16);
            }
        });
    }
}