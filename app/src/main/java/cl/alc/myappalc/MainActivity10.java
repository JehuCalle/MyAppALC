package cl.alc.myappalc;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {

    private Button btnRegresarHtel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        btnRegresarHtel1 = (Button) findViewById(R.id.btnRegresarHtel1);

        btnRegresarHtel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //CODIGO BOTON REGRESAR
                Intent Intent17 = new Intent(MainActivity10.this,MainActivity6.class);
                startActivity(Intent17);
            }
        });
    }
}